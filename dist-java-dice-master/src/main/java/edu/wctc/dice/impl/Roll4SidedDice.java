package edu.wctc.dice.impl;

import edu.wctc.dice.iface.Dice;
import edu.wctc.dice.iface.GameOutput;

import java.util.Random;

public class Roll4SidedDice implements Dice {
    public int rollDie() {
        Random random = new Random();
        return random.nextInt(4) + 1;
//        return dieRoller.rollDie();
    }
}
