package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage;
        this.weapon = weapon;
    }

    public int healthRemaining () {
        return healthPercentage;
    }
    public void checkAndSetHealth (int healthPercentage) {
         if (healthPercentage<0) {
             this.healthPercentage = 0;
         } else if (healthPercentage>100) {
             this.healthPercentage = 100;
         } else  {
             this.healthPercentage= healthPercentage;
         }
    }

    public void loseHealth(int damage) {
        int healthRemain = healthPercentage -damage;
        if(healthPercentage<0) {
            System.out.println(name + " player has been knocked out of game");
        }
        checkAndSetHealth(healthRemain);
    }

    public void restoreHealth(int healthPotion) {
        int healthRemain= healthPercentage + healthPotion;
        checkAndSetHealth(healthRemain);
    }
}
