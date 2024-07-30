package org.example;

public enum Weapon {
    SWORD(25,20),
    AXE(40,15),
    MACE(20,20);

    private int damage;
    private double attackSpeed;

    Weapon(int damage,double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }


    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
