package com.codecool.mightytextadventure.data;

import static com.codecool.mightytextadventure.logic.Utilities.getRandomNumber;
import static java.lang.System.exit;

import com.codecool.mightytextadventure.logic.AdvanceTextClass;
import com.codecool.mightytextadventure.logic.PokemonBattle;
import com.codecool.mightytextadventure.logic.RiddleChecker;
import com.codecool.mightytextadventure.logic.Utilities;
import com.codecool.mightytextadventure.ui.Display;
import com.codecool.mightytextadventure.ui.Input;

import java.util.ArrayList;

public class AreaActions {
    private final Display display;
    private final Input input;
    Pokemon playerPokemon;
    Pokemon snorlaxBoss = new Pokemon("Snorlax", 35, 3, "BODYSLAM", PokemonTypes.NORMAL.getAttackType(), PokemonTypes.NORMAL.getPokemonType(), false);
    Pokemon buneary = new Pokemon("Buneary", getRandomNumber(20, 25), getRandomNumber(2, 4), "JUMP KICK", PokemonTypes.FIGHTING.getAttackType(), PokemonTypes.NORMAL.getPokemonType(), true);

    Pokemon eevee = new Pokemon("Eevee", getRandomNumber(20, 25), getRandomNumber(2, 4), "BITE", PokemonTypes.DARK.getAttackType(), PokemonTypes.NORMAL.getPokemonType(), true);

    Pokemon pikachu = new Pokemon("Pikachu", getRandomNumber(20, 25), getRandomNumber(2, 4), "THUNDERBOLT", PokemonTypes.ELECTRIC.getAttackType(), PokemonTypes.ELECTRIC.getPokemonType(), true);

    Pokemon unown = new Pokemon("Unown", 6, getRandomNumber(1, 2), "HIDDEN POWER", PokemonTypes.values()[getRandomNumber(0, 17)].getAttackType(), PokemonTypes.PSYCHIC.getPokemonType(), false);

    private String playerPokemonName = "";

    public AreaActions(Display display, Input input) {
        this.display = display;
        this.input = input;
    }

    public void enterStartRoom(String userName) {
        int randomNumRiddles = Utilities.getRandomNumber(0, 2);
        int counterTries = 0;
        RiddleChecker riddleChecker = new RiddleChecker();

        display.printMessage("Let's start the game!");
        AdvanceTextClass.advanceText();
        display.printMessage("On a sunny day, you are walking on a beautiful field. Suddenly, you feel a rumble.");
        AdvanceTextClass.advanceText();
        display.printMessage("You feel the ground giving in underneath you and fall... " + userName + " 'entered' the Ruins of Alph!");
        AdvanceTextClass.advanceText();
        display.printMessage("You are in a dark room, only a few rays of sunlight passing through the hole you just fell through. You can hear something whimpering...");
        AdvanceTextClass.advanceText();
        display.printMessage("You see a small creature. It is hurt and locked in a cage... From your years at Trainer school, you can identify it as one of the following Pokemon:");
        display.printMessage(buneary.getName() + "\n" + eevee.getName() + "\n" + pikachu.getName() + "\n");

        String pickedPokemon = "";
        while (true) {
            if (pickedPokemon.equalsIgnoreCase(buneary.getName()) || pickedPokemon.equalsIgnoreCase(eevee.getName()) || pickedPokemon.equalsIgnoreCase(pikachu.getName()) || pickedPokemon.equalsIgnoreCase("1") || pickedPokemon.equalsIgnoreCase("2") || pickedPokemon.equalsIgnoreCase("3")) {
                switch (pickedPokemon.toLowerCase()) {
                    case "buneary", "1" -> {
                        playerPokemon = buneary;
                        pickedPokemon = playerPokemon.getName();
                    }
                    case "eevee", "2" -> {
                        playerPokemon = eevee;
                        pickedPokemon = playerPokemon.getName();
                    }
                    case "pikachu", "3" -> {
                        playerPokemon = pikachu;
                        pickedPokemon = playerPokemon.getName();
                    }
                }
                break;
            } else {
                display.printMessage("Pick one of the listed Pokemon!");
                pickedPokemon = input.getInputFromUser();
            }
        }

        display.printMessage(userName + ", you have to help " + pickedPokemon + "!");
        AdvanceTextClass.advanceText();
        display.printMessage("You see that the lock of " + pickedPokemon + "'s cage can be unlocked by typing in a term.");
        AdvanceTextClass.advanceText();
        display.printMessage("After you looked around for a while, you see something engraved in the wall next to the cage... it looks like a riddle!");
        AdvanceTextClass.advanceText();
        display.printMessage("You have to solve it, " + userName + "! You have 3 tries, and this is the riddle: \n\n" + Riddles.values()[randomNumRiddles].getRiddle() + "\n");

        String userAnswerRiddle = input.getInputFromUser();
        boolean isCorrectAnswer = riddleChecker.checkAnswer(randomNumRiddles, userAnswerRiddle);

        while (!isCorrectAnswer && counterTries < 2) {
            counterTries += 1;
            display.printMessage("This is incorrect! You have " + (3 - counterTries) + " tries left!");
            userAnswerRiddle = input.getInputFromUser();
            isCorrectAnswer = riddleChecker.checkAnswer(randomNumRiddles, userAnswerRiddle);
            if (counterTries == 2) {
                display.printMessage("You have failed to solve the riddle! The whole ruins begin to rumble!!!! You and " + pickedPokemon + " get buried under the stones of the falling building! Game Over!");
                exit(0);
            }
        }
        if (isCorrectAnswer) {
            display.printMessage("Congratulations! You have freed " + pickedPokemon + "!\n" + "Now, let's name it!");
            String customPokemonName = input.getInputFromUser();
            if (customPokemonName.trim().length() != 0) playerPokemon.setCustomName(customPokemonName.trim());
            playerPokemonName = playerPokemon.getCustomName();
            display.printMessage(playerPokemonName + " appears severely hurt! You have to quickly find a way to heal it! You look around and see a door leading to another room! You walk through it holding the hurt pokemon in your arms...");
        }
    }

    public void enterRoom1(String userName) {
        Display display = new Display();
        Input input = new Input();
        ArrayList<String> corners = new ArrayList<>();
        AdvanceTextClass.advanceText();
        display.printMessage("""
                As you enter the next room, your item finder beeps!""");
        AdvanceTextClass.advanceText();
        display.printMessage("""
                You look around the dimly lit room - despite the passage of time, the room's walls and floors are surprisingly well-preserved, with intricate carvings and symbols etched into the stone.""");
        AdvanceTextClass.advanceText();
        display.printMessage("""
                In every corner you can see especially impressive and big symbols.""");
        AdvanceTextClass.advanceText();
        display.printMessage("""
                They appear to be come from some sort of ancient alphabet. You have a hard time reading it; maybe you should give them a closer look,""" + " " + userName + """
                ...
                Which corner do you want to check out? Type in upper left, upper right, lower left or lower right.
                """);

        String chosenCorner = input.getInputFromUser();
        String cornerWithPotion = Room2Corners.values()[Utilities.getRandomNumber(0, 3)].getCorner();

        while (!chosenCorner.equalsIgnoreCase("upper left") && !chosenCorner.equalsIgnoreCase("upper right") && !chosenCorner.equalsIgnoreCase("lower left") && !chosenCorner.equalsIgnoreCase("lower right")) {
            display.printMessage("Please choose one of the corners!");
            chosenCorner = input.getInputFromUser();
        }


        while (true) {
            System.out.println("corners" + corners);
            if (corners.contains(chosenCorner)) {
                display.printMessage("You are checking the same corner again, just to be sure! But there's nothing more to find. \n" + "Which corner do you want to check out next? Type in upper left, upper right, lower left or lower right.");
                chosenCorner = input.getInputFromUser();
            } else if (cornerWithPotion.equalsIgnoreCase(chosenCorner)) {
                display.printMessage("You found a potion, " + userName + "! You can use it to heal " + playerPokemonName + "\nYou can use it by typing 'use potion'!");
                String usePotion = input.getInputFromUser();
                if (usePotion.equalsIgnoreCase("use potion")) {
                    display.printMessage("You healed " + playerPokemonName + "! They happily jump up and down, but you can feel the earth trembling.\n" + "You are worried those old ruins will soon collapse. You look around the room and see a door leading to a brightly lit room!\n" + "This must be the exit, " + userName + "! You walk through the door, the pokemon trotting beside you...");
                    playerPokemon.resetCurrentHealth();
                }
                break;
            } else {
                display.printMessage("A " + unown.getName() + " appears! You have to fight it, " + userName + "!");
                new PokemonBattle(playerPokemon, unown);
                unown.setRandomAttackType(PokemonTypes.values()[getRandomNumber(0, 17)].getPokemonType());
                unown.resetCurrentHealth();
                corners.add(chosenCorner);
                display.printMessage("Your item finder is still beeping! There might be a potion around!\n" + "You should keep looking in the other corners, " + userName + "!\n" + "Which corner do you want to check out next? Type in upper left, upper right, lower left or lower right.");
                chosenCorner = input.getInputFromUser();
            }

        }

    }

    public void enterLastRoom(String userName) {
        Display display = new Display();
        Input input = new Input();
        String userChoice2 = "";
        String endBossName = snorlaxBoss.getName();
        int randomWinChance = Utilities.getRandomNumber(1, 2);

        display.printMessage("You entered the next room, " + userName + "\n" + "A ray of light blinds your eyes. As your eyes adept to the brightness, you suddenly realise:\n" + "THE EXIT! Light means exit! You and " + playerPokemonName + " are thrilled! ... at first. \n" + "But then, you realize something. The exit is blocked by a big, chubby, fluffy, dangerous Pokemon: " + endBossName + "! What will you do? Choose between the following options:\n" + "- sneak past the " + endBossName + " and escape the ruins!\n" + "- go back to the previous room!\n" + "Type in sneak or back!");
        String userChoice = input.getInputFromUser();
        while (!userChoice.equalsIgnoreCase("sneak") && !userChoice.equalsIgnoreCase("back")) {
            display.printMessage("Please choose one of the options!");
            if (userChoice.equalsIgnoreCase("sneak")) {
                display.printMessage("You sneak past the " + endBossName + " but suddenly, "
                        + playerPokemonName + " sneezes!!!\n" +
                        "The " + endBossName + " wakes up and sees you!\n" +
                        "What do you do? Choose between the following options:\n" +
                        "- fight the " + endBossName + "!\n" + "- run away!\n" + "- hide\n" +
                        "Type in fight, run or hide!");
                userChoice2 = input.getInputFromUser();
            } else if (userChoice.equalsIgnoreCase("back")) {
                display.printMessage("You go back to the previous room. But suddenly you feel something crunching underneath your shoe!\n" +
                        "You stepped on a dry branch! The" + endBossName + " wakes up and sees you!\n" +
                        "What do you do? Choose between the following options:\n" +
                        "- fight the " + endBossName + "!\n" + "- run away!\n" + "- hide!\n" +
                        "Type in fight, run or hide!");
                userChoice2 = input.getInputFromUser();
            }
        }
        while (!userChoice2.equalsIgnoreCase("fight") && !userChoice2.equalsIgnoreCase("run") && !userChoice2.equalsIgnoreCase("hide")) {
            display.printMessage("Please choose one of the options!");
            userChoice2 = input.getInputFromUser();
        }
        if (userChoice2.equalsIgnoreCase("fight")) {
            display.printMessage("You chose to fight" + endBossName + "!\n");
            new PokemonBattle(playerPokemon, snorlaxBoss);
            display.printMessage("I won! I finally am able to flee the ruins!");
        } else if (userChoice2.equalsIgnoreCase("run")) {
            display.printMessage("You chose to run away!\n");
            if (randomWinChance == 1) {
                display.printMessage("You run as fast as you can, but the " + endBossName + " is faster!\n" + "It catches you and you are trapped!\n" + "Game Over!");
            } else if (randomWinChance == 2) {
                display.printMessage("You run as fast as you can!! You are so fast, you manage to escape the ruins! You win!");
            }
            if (userChoice2.equalsIgnoreCase("fight")) {
                display.printMessage("You chose to fight " + endBossName +"!\n");
                new PokemonBattle(playerPokemon, snorlaxBoss);
                display.printMessage("You are finally able to flee the ruins! You are free now!");
            } else if (userChoice2.equalsIgnoreCase("run")) {
                display.printMessage("You chose to run away!\n");
                if (randomWinChance == 1) {
                    display.printMessage("You run as fast as you can, but the " + endBossName + " is faster!\n" + "It catches you and you are trapped!\n" + "Game Over!");
                } else if (randomWinChance == 2) {
                    display.printMessage("You run as fast as you can!! You are so fast, you manage to escape the ruins! You win!");
                }
                ;
            } else if (userChoice2.equalsIgnoreCase("hide")) {
                display.printMessage("You chose to hide!\n");
                if (randomWinChance == 1) {
                    display.printMessage("You quickly hide behind a big rock, but the " + endBossName + " saw you just when you disappeared behind it!\n" + "It catches you! You are trapped in the ruins!\n" + "Game Over!");
                } else if (randomWinChance == 2) {
                    display.printMessage("You quickly hide behind a big rock, the " + endBossName + " cannot see you anymore.\n" + "After a while it goes into another room, probably to search for you there. You take the chance and run through the exit!\n" + "You made it!");
                }
                ;
            }
        }
    }
}
