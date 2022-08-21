package org.example;

public class Main {
    public static void main(String[] args) {

        WeaponType weaponType = WeaponType.PISTOLS;
        Weapon weapon = new Weapon(weaponType, "GUN");
        Boss boss = new Boss(400, 116, weapon);
        System.out.println(boss.printinfo());
        WeaponType weaponType1 = WeaponType.REVOLVERS;
        Weapon weapon1 = new Weapon(weaponType1, "Archery  ");
        Skeleton skeleton = new Skeleton(200, 120, weapon1, 15);
        System.out.println(skeleton.printinfo());
        WeaponType weaponType2 = WeaponType.HANDGUNS;
        Weapon weapon2 = new Weapon(weaponType2, "Archery  ");
        Skeleton skeleton2 = new Skeleton(220, 150, weapon2, 10);
        System.out.println(skeleton2.printinfo());
    }
}