package main;

import java.util.ArrayList;
import java.util.Scanner;

class Runner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Object> SanTeam = new ArrayList<>();
        ArrayList<Object> HonTeam = new ArrayList<>();

        System.out.println("how many SanSalvadorian fighters do you want");
        int a = scan.nextInt();
        System.out.println("how many Hondorian fighters do you want");
        int b = scan.nextInt();

        // creates 20 of each faction and puts them in a list
        for (int i = 0; i < a; i++) {
            Hondurian manh = new Hondurian();
            HonTeam.add(manh);
        }

        for (int i2 = 0; i2 < b; i2++) {
            SanSalvadorian mans = new SanSalvadorian();
            SanTeam.add(mans);
        }

        //begains fight
        fight(SanTeam, HonTeam, scan);

    }

    private static void fight(ArrayList SanTeam, ArrayList HonTeam, Scanner scan) {
        int fightNum = 0;
        while ((SanTeam.isEmpty() == false) || (HonTeam.isEmpty() == false)) { //fight ends when one team is dead


            SanSalvadorian s = (SanSalvadorian) SanTeam.get(0);
            Hondurian h = (Hondurian) HonTeam.get(0);

            int sTotalPower = (s.getWeaponPower() + s.getSpeed()) * s.getStrength(); // total power = (weapon power + speed) * Strength
            int hTotalPower = (h.getWeaponPower() + h.getSpeed()) * s.getStrength();

            System.out.println("fight num " + fightNum + "\n");
            System.out.println("SanSalvadorian Stats \nStrength:" + s.getStrength() + "lb deadlift" + "\nSpeed:" + s.getSpeed() + "mph" + "\nWeapon: " + s.getWeapon() + "\nWeaponPower: " + s.getWeaponPower() + "\n");
            System.out.println("Hondorian Stats \nStrength:" + h.getStrength() + "lb deadlift" + "\nSpeed:" + h.getSpeed() + "mph" + "\nWeapon: " + h.getWeapon() + "\nWeaponPower: " + h.getWeaponPower() + "\n");

            if (sTotalPower > hTotalPower) { // checks if SanSalvadorian won
                HonTeam.remove(0);
                System.out.println("SanSalvadorian won\n");
            } else if (hTotalPower > sTotalPower) { // checks if Hondorian won
                SanTeam.remove(0);
                System.out.println("Hondorian won\n");
            } else { // cheks for ties
                HonTeam.remove(0);
                SanTeam.remove(0);
                System.out.println("Tie, both die\n");
            }

            System.out.println("SanSalvadorians alive " + SanTeam.size() + "\t Hondorians alive " + HonTeam.size() + "\n");

            // gets input befor continuing fight
            System.out.println("enter 1 to continue");
            int x = 0;
                while (x == 0) {
                    x = scan.nextInt();
                }


            // checks for when one team dies and prints the remaining on each side
            if ((SanTeam.isEmpty() == true) || (HonTeam.isEmpty() == true)) {
                if (SanTeam.size() > HonTeam.size()){
                    System.out.println("\nSanSalvador is the better country");
                } else if (HonTeam.size() > SanTeam.size()){
                    System.out.println("\nHonduras is the better country");
                } else {
                    System.out.println("\nboth countries suck");
                }
                return;
            }

        }
    }
}
