package main;

import java.util.ArrayList;

public class Weapons {

    // vars
    private String weapon;
    private int power;

    //generates a random weapon w/ stats
    public Weapons() {
        this.weapon = getRanWeapon(); // gets random weapon
        this.power = ((int)(Math.random() * 11)); //gives weapon random power from 1 to 10 inclusive
    }

    public String getWeapon() {
        return weapon;
    }

    public int getPower() {
        return power;
    }

    //gets random weapon from list
    private static String getRanWeapon() {
        ArrayList<String> weapons = new ArrayList<>();
        weapons.add(0, "foot");
        weapons.add(1, "fist");
        weapons.add(2, "m14");
        weapons.add(3, "olympia");
        weapons.add(4, "ray gun");
        weapons.add(5, "bowie knife");
        weapons.add(6, "fortnite scar");
        weapons.add(7, "fortnite shotgun");
        weapons.add(8, "Ford F150 2014 model");
        weapons.add(9, "dwayne \"the rock\" johnsen");

        return weapons.get((int)(Math.random() * 10));
    }
}
