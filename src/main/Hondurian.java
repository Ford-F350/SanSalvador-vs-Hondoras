package main;

public class Hondurian {

    // variables
    private int id;
    private int speed;
    private int strength;
    private String weapon;
    private int weaponPower;

    // makes random Hondurian w/ random characteristics
    public Hondurian() {
        Weapons test = new Weapons();
        this.id = ((int) (Math.random() * 1000) + 1); // random id between 1 - 1000 inclusive
        this.speed = ((int) (Math.random() * 21) + 10); // random speed between 10 - 30 mph inclusive
        this.strength = ((int) (Math.random() * 851) + 150); // random strength between 150 psi - 1000 psi inclusive
        this.weapon = test.getWeapon();
        this.weaponPower = test.getPower();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getWeaponPower() {
        return weaponPower;
    }

    public void setWeaponPower(int weaponPower) {
        this.weaponPower = weaponPower;
    }

    @Override
    public String toString() {
        return "Hondurian{" +
                "id=" + id +
                ", speed=" + speed +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                ", weaponPower=" + weaponPower +
                '}';
    }
}
