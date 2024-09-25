package Player; 

/**
 * Player class represents a player character with attributes such as name,
 * health, power, and defense. It includes methods to attack an enemy
 * and take damage from an attack.
 */
public class Player {
    // Properties/fields
    private String name; // Name of the player
    private int health;  // Health points of the player
    private int power;   // Attack power of the player
    private int defense; // Defense points of the player

    // Constructor to initialize the Player with name, health, power, and defense
    public Player(String name, int health, int power, int defense) {
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

    // Attack method allows the player to attack an enemy
    public void attack(Enemy.Enemy Enemy) {
        System.out.println(this.name + " attacks " + Enemy.getName());
        Enemy.takeDamage(this.power);
    }

    // Take damage method reduces health based on attack received
    public void takeDamage(int attackPower) {
        int damage = attackPower - this.defense; // Calculate effective damage
        if (damage > 0) {
            this.health -= damage; // Reduce health by damage
            System.out.println(this.name + " takes " + damage + " damage. Health is now " + this.health);
        } else {
            System.out.println(this.name + " blocks the attack!"); // No damage taken
        }

        if (this.health <= 0) {
            System.out.println(this.name + " died!"); // Player dies if health is 0 or less
        }
    }
}
