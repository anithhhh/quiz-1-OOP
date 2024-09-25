package Enemy; // Correct package name (lowercase)

import Player.Player; // Import Player class from player package

/**
 * Enemy class represents an adversary in the game with attributes such as
 * name, health, power, and defense. It includes methods to attack a player
 * and take damage from an attack.
 */
public class Enemy {
    // Properties/fields
    private String name; // Name of the enemy
    private int health;  // Health points of the enemy
    private int power;   // Attack power of the enemy
    private int defense; // Defense points of the enemy

    // Constructor to initialize the Enemy with name, health, power, and defense
    public Enemy(String name, int health, int power, int defense) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.defense = defense;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for health
    public int getHealth() {
        return health;
    }

    // Attack method allows the enemy to attack a player
    public void attack(Player player) {
        System.out.println(this.name + " attacks " + player.getName());
        player.takeDamage(this.power); // Pass the attack power to the player
    }

    // Take damage method reduces health based on attack received
    public void takeDamage(int attackPower) {
        int damage = attackPower - this.defense; // Calculate effective damage
        if (damage > 0) {
            this.health -= damage; // Reduce health by the damage taken
            System.out.println(this.name + " takes " + damage + " damage. Health is now " + this.health);
        } else {
            System.out.println(this.name + " blocks the attack!"); // No damage taken if attack is weaker than defense
        }

        if (this.health <= 0) {
            System.out.println(this.name + " died!"); // Enemy dies if health is 0 or less
        }
    }
}
