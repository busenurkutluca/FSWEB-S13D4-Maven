package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    // Constructor
    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
        // Sağlık değerini 0 ile 100 arasında ayarlıyoruz
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
    }

    // healthRemaining metodu: Sağlık değerini döner
    public int healthRemaining() {
        return healthPercentage;
    }

    // loseHealth metodu: Verilen damage kadar sağlık düşer, 0'ın altına inerse oyundan çıkar
    public void loseHealth(int damage) {
        this.healthPercentage -= damage;
        if (this.healthPercentage <= 0) {
            System.out.println(this.name + " player has been knocked out of game");
            this.healthPercentage = 0;  // Sağlık 0'ın altına düşmesin
        }
    }

    // restoreHealth metodu: Verilen healthPotion kadar sağlık arttırılır, 100'ü geçemez
    public void restoreHealth(int healthPotion) {
        this.healthPercentage += healthPotion;
        if (this.healthPercentage > 100) {
            this.healthPercentage = 100;  // Sağlık 100'ü aşmasın
        }
    }
}