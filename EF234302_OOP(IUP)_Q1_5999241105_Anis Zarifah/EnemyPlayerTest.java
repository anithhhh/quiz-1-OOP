package EnemyPlayerTest; // Correct package name (lowercase)

import Enemy.Enemy;
import Player.Player;

/**
 * EnemyPlayerTest class is used to test the Player and Enemy classes
 * by simulating a simple combat scenario between a player and an enemy.
 */
public class EnemyPlayerTest {
    public static void main(String[] args) {
        // Create a Player and an Enemy
        Player Player = new Player("Hero", 100, 20, 10); // Create a Player with 100 health, 20 power, and 10 defense
        Enemy Enemy = new Enemy("Goblin", 50, 15, 5); // Create an Enemy with 50 health, 15 power, and 5 defense

        // Display initial states
        System.out.println("--- Battle Start ---");
        System.out.println(Player.getName() + " Health: " + Player.getHealth());
        System.out.println(Enemy.getName() + " Health: " + Enemy.getHealth());

        // Simulate a simple combat sequence
        while (Player.getHealth() > 0 && Enemy.getHealth() > 0) {
            // Player attacks enemy
            Player.attack(Enemy);
            // Check if enemy is still alive before the enemy attacks
            if (Enemy.getHealth() > 0) {
                // Enemy attacks player
                Enemy.attack(Player);
            }
        }

        // Announce the outcome of the battle
        if (Player.getHealth() <= 0 && Enemy.getHealth() <= 0) {
            System.out.println("Both " + Player.getName() + " and " + Enemy.getName() + " died!");
        } else if (Player.getHealth() <= 0) {
            System.out.println(Player.getName() + " has been defeated!");
        } else if (Enemy.getHealth() <= 0) {
            System.out.println(Enemy.getName() + " has been defeated!");
        }
        System.out.println("--- Battle End ---");
    }
}
