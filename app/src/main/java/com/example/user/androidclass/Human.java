package com.example.user.androidclass;

public class Human{

    private String name;
    public final static int FIRE_BOW = 1;
    public final static int ICE_BOW = 2;

    Human() {

    }

    public void attack() {
        System.out.println("Fist Attack!");
    }
}

class Hunter extends Human {
    private int hunterGetWeapon;

    Hunter() {
        System.out.println("Equip Default Bow!");
        this.hunterGetWeapon = 0;
    }

    Hunter(int fireBow) {
        System.out.println("Equip Fire Bow!");
        this.hunterGetWeapon = 1;
    }

    Hunter(int fireBow, int iceBow) {
        System.out.println("Equip Ice Bow");
        this.hunterGetWeapon = 2;
    }

    @Override
    public void attack() {
        if (hunterGetWeapon == 0)
            System.out.println("Arrow Attack!");
        else if (hunterGetWeapon == 1)
            System.out.println("Fire Arrow Attack!");
        else if (hunterGetWeapon == 2)
            System.out.println("Ice Arrow Attack!");
    }
}

class Warrior extends Human {
    private int warriorGetWeapon;

    Warrior() {
        System.out.println("Equip Default Blade");
        this.warriorGetWeapon = 0;
    }

    Warrior(int fireBlade) {
        System.out.println("Equip Fire Blade");
        this.warriorGetWeapon = 1;
    }

    Warrior(int fireBlade, int iceBlade) {
        System.out.println("Equip Ice Blade");
        this.warriorGetWeapon = 2;
    }

    @Override
    public void attack() {
        if (warriorGetWeapon == 0)
            System.out.println("Slash!");
        else if (warriorGetWeapon == 1)
            System.out.println("Fire Slash");
        else if (warriorGetWeapon == 2)
            System.out.println("Ice Slash");
    }
}

class Mage extends Human {
    private int mageGetWeapon;

    Mage() {
        System.out.println("Equip Default Staff!");
        this.mageGetWeapon = 0;
    }

    Mage(int fireBow) {
        System.out.println("Equip Fire Staff!");
        this.mageGetWeapon = 1;
    }

    Mage(int fireBow, int iceBow) {
        System.out.println("Equip Ice Staff");
        this.mageGetWeapon = 2;
    }

    @Override
    public void attack() {
        if (mageGetWeapon == 0)
            System.out.println("Arcane Missiles!");
        else if (mageGetWeapon == 1)
            System.out.println("Fireball !");
        else if (mageGetWeapon == 2)
            System.out.println("Frostbolt !");
    }
}



