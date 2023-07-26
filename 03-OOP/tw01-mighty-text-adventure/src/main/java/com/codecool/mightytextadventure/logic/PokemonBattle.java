package com.codecool.mightytextadventure.logic;

import com.codecool.mightytextadventure.data.Pokemon;
import com.codecool.mightytextadventure.ui.Display;

import java.util.Objects;
import java.util.Scanner;

import static com.codecool.mightytextadventure.logic.Utilities.getRandomNumber;

public class PokemonBattle {

    Scanner scanner = new Scanner(System.in);

    private String action;

    private boolean playerFled = false;

    Display display = new Display();

    public PokemonBattle(Pokemon playerPokemon, Pokemon enemyPokemon) {

        printPokemonHP(playerPokemon, enemyPokemon);

        while ((!playerPokemon.checkIfFainted() && !enemyPokemon.checkIfFainted()) && !playerFled) {
            display.printMessage("What would you like to do?\n- Attack\n- Flee");
            action = scanner.nextLine();

            switch (action.toLowerCase()) {
                case "attack", "1" -> {
                    enemyPokemon.getsAttacked(playerPokemon.getAttackStat(), playerPokemon.getPokemonAttackType());
                    if(enemyPokemon.checkIfFainted()) {
                        printPlayerAttack(playerPokemon, enemyPokemon);
                        break;
                    };
                    playerPokemon.getsAttacked(enemyPokemon.getAttackStat(), enemyPokemon.getPokemonAttackType());
                    printBothAttack(playerPokemon, enemyPokemon);
                }
                case "flee", "2" -> {
                    playerFled = playerPokemon.getMaxHealthStat() / 2 < playerPokemon.getCurrentHealthStat() ? getRandomNumber(1, 100) <= 90 : getRandomNumber(1, 100) <= 25;

                    if(playerFled && !Objects.equals(enemyPokemon.getName(), "Snorlax")) {
                        break;
                    }

                    if(Objects.equals(enemyPokemon.getName(), "Snorlax")) {
                        playerFled = false;
                        display.printMessage("You are unable too flee!");
                    } else {
                        playerPokemon.getsAttacked(enemyPokemon.getAttackStat(), enemyPokemon.getPokemonAttackType());
                        display.printMessage("\n");
                        display.printMessage("Flee failed!");
                        printEnemyAttack(playerPokemon, enemyPokemon);
                    }
                }
                default -> display.printMessage("Invalid Action!");
            }
        }

        if (playerPokemon.checkIfFainted()) {
            display.printMessage("You have failed to defeat the " + enemyPokemon.getName() + "! The whole ruins begin to rumble!!!! You and " + playerPokemon.getCustomName() + " get buried under the stones of the falling building! Game Over!");
            System.exit(0);
        }
        else if (enemyPokemon.checkIfFainted()) {
            display.printMessage("You won! The wild Pokemon was defeated!");
        }
        else if(playerFled) {
            display.printMessage("You fled successfully!");
        }

    }

    private void printBothAttack(Pokemon playerPokemon, Pokemon enemyPokemon) {
        display.printMessage("\n");
        display.printMessage(playerPokemon.getCustomName() + " used " + playerPokemon.getAttackName());
        printEffectiveness(enemyPokemon, playerPokemon);
        display.printMessage(enemyPokemon.getName() + " used " + enemyPokemon.getAttackName());
        printEffectiveness(playerPokemon, enemyPokemon);
        printPokemonHP(playerPokemon, enemyPokemon);
    }

    private void printEnemyAttack(Pokemon playerPokemon, Pokemon enemyPokemon) {
        display.printMessage(enemyPokemon.getName() + " used " + enemyPokemon.getAttackName());
        printEffectiveness(playerPokemon, enemyPokemon);
        printPokemonHP(playerPokemon, enemyPokemon);
    }

    private void printPlayerAttack(Pokemon playerPokemon, Pokemon enemyPokemon) {
        display.printMessage(playerPokemon.getCustomName() + " used " + playerPokemon.getAttackName());
        printEffectiveness(enemyPokemon, playerPokemon);
        printPokemonHP(playerPokemon, enemyPokemon);
    }

    private void printPokemonHP(Pokemon playerPokemon, Pokemon enemyPokemon) {
        display.printMessage(playerPokemon.getCustomName() + " HP: " + playerPokemon.getCurrentHealthStat() + "\n" + enemyPokemon.getName() + " HP: " + enemyPokemon.getCurrentHealthStat() + "\n");

    }

    private void printEffectiveness(Pokemon defenderPokemon, Pokemon attackerPokemon) {
        display.printMessage(defenderPokemon.checkEffectiveness(attackerPokemon.getAttackName(), attackerPokemon.getPokemonAttackType()));
    }

}
