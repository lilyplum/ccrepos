package com.codecool.mightytextadventure.data;

import java.util.Arrays;
import java.util.Optional;

public class Pokemon {

    private final String name;
    private final int maxHealthStat;
    private final int attackStat;
    private final String attackName;
    private final PokemonTypes pokemonType;
    private final PokemonTypes[] weaknesses;
    private final PokemonTypes[] resistances;
    private final PokemonTypes[] immunities;
    private final float weaknessMultiplier = 2.f;
    private final float resistanceMultiplier = 0.5f;
    private final float immuneMultiplier = 0.f;
    private final float normalMultiplier = 1.f;
    private String customName;
    private int currentHealthStat;
    private PokemonTypes attackType;

    public Pokemon(String name, int healthStat, int attackStat, String attackName, PokemonTypes attackType, PokemonTypes pokemonType, boolean isHurt) {
        this.name = name;
        this.customName = name;
        this.maxHealthStat = healthStat;
        this.currentHealthStat = isHurt ? 10 : healthStat;
        this.attackStat = attackStat;
        this.attackName = attackName;
        this.attackType = attackType;
        this.pokemonType = pokemonType;
        this.weaknesses = pokemonType.getWeaknesses();
        this.resistances = pokemonType.getResistances();
        this.immunities = pokemonType.getImmunities();
    }

    public void setRandomAttackType(PokemonTypes attackType) {
        this.attackType = attackType;
    }

    public void resetCurrentHealth() {
        this.currentHealthStat = maxHealthStat;
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String name) {
        this.customName = name;
    }

    public String getName() {
        return name;
    }

    public int getMaxHealthStat() {
        return maxHealthStat;
    }

    public int getCurrentHealthStat() {
        return currentHealthStat;
    }

    public PokemonTypes getPokemonType() {
        return pokemonType;
    }

    public PokemonTypes getPokemonAttackType() {
        return attackType;
    }

    public int getAttackStat() {
        return attackStat;
    }

    public String getAttackName() {
        return attackName;
    }

    public void printTypes() {
        for (PokemonTypes[] types : new PokemonTypes[][]{weaknesses, resistances, immunities}) {
            System.out.println(Arrays.toString(types));
        }
    }

    public void getsAttacked(int damage, PokemonTypes type) {
        float multiplier = findMultiplier(type);
        int damageTaken = (int) Math.ceil(damage * multiplier);
        currentHealthStat -= damageTaken;
        if (currentHealthStat < 0) {
            currentHealthStat = 0;
        }
    }

    public String checkEffectiveness(String enemyAttack, PokemonTypes type) {
        if (Float.compare(findMultiplier(type), weaknessMultiplier) == 0) {
            return enemyAttack + " was very effective!";
        }
        if (Float.compare(findMultiplier(type), normalMultiplier) == 0) {
            return "\b";
        }
        if (Float.compare(findMultiplier(type), resistanceMultiplier) == 0) {
            return enemyAttack + " was not very effective!";
        }
        if (Float.compare(findMultiplier(type), immuneMultiplier) == 0) {
            return enemyAttack + " has no effect on " + this.customName;
        }

        return "";
    }

    private float findMultiplier(PokemonTypes type) {
        Optional<Float> multiplier = findOneMultiplier(weaknesses, type, weaknessMultiplier);
        if (multiplier.isPresent()) {
            return multiplier.get();
        }
        multiplier = findOneMultiplier(resistances, type, resistanceMultiplier);
        if (multiplier.isPresent()) {
            return multiplier.get();
        }
        multiplier = findOneMultiplier(immunities, type, immuneMultiplier);
        if (multiplier.isPresent()) {
            return multiplier.get();
        }
        return normalMultiplier;
    }

    private Optional<Float> findOneMultiplier(PokemonTypes[] available, PokemonTypes target, float multiplier) {
        for (PokemonTypes types : available) {
            if (types == target) {
                return Optional.of(multiplier);
            }
        }
        return Optional.empty();
    }


    public boolean checkIfFainted() {
        return currentHealthStat <= 0;
    }
}
