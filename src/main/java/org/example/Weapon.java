package org.example;

public enum Weapon {
    SWORD(10, 1.5),
    AXE(12, 1.2),
    BOW(8, 1.8);

    private int damage;        // Hasar miktarı
    private double attackSpeed; // Saldırı hızı

    // Constructor (yapıcı) ile enum sabitlerine değer atanıyor
    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    // Getter metodları
    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}

