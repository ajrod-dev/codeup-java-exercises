import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class ConsoleAdventureGame {
    public static void main(String[] args) {

    }

    public static void game(){
        // Initial variables
        Scanner sc = new Scanner(System.in);
        String name;
        String[] enemies = {"skeleton", "ogre", "zombie", "goblin"};
        String weapon;
        String enemy;
        int coins = 10;
        int MaxHP = 100;
        int HP = 100;
        int attackPoints = (int)(Math.random() * (25 - 15) + 1);
        int enemyHP = (int)(Math.random() * (80 - 65) + 1);
        int potions = 3;

        // Game start
        name = start();
        System.out.println("Welcome " + name + ". (Type [exit] at any point to exit the game.)");
        weapon = chooseWeapon();
        while(!sc.next().equalsIgnoreCase("exit")){
            System.out.println("Which way do you wish to travel to?");
            System.out.println("North is a village, south is the caves, \neast is the forest, and west is the mountains.");
            System.out.println("Type [n], [s], [e], [w]");
            String direction = sc.next();
            if(direction.equals("n")){
                village(name, weapon, coins);
            }else if(direction.equals("s")){
                caves(name, weapon, coins);
            }else if(direction.equals("e")){
                forest(name, weapon, coins);
            }else if(direction.equals("w")){
                dungeons(name, weapon, coins);
            }else if(sc.next().equalsIgnoreCase("exit")){
                System.out.println("GAME OVER");
                System.exit(0);
            }

        }

    }

    public static String start(){
        // Welcome screen
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println(" ");
        System.out.println("Welcome to Adventure Game");
        System.out.println(" ");
        System.out.println("----------------------");
        System.out.println("Enter your name: ");
        return sc.next();
    }

    public static String chooseWeapon(){
        // Choose weapon
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your weapon. You can choose a sword, an axe, or a bow.");
        System.out.println("Enter [s], [a], or [b] to select your weapon.");
        return sc.next();
    }

    public static void village(String name, String weapon, int coins, String enemy, int health, int potions){
        String[] enemies = {"skeleton", "ogre", "zombie", "goblin"};
        String enemy = getRandom(enemies);
        Scanner sc = new Scanner(System.in);
        String response;
        System.out.println("Heading to the village...");
        System.out.println("An older couple is approaching you as you enter the village.");
        System.out.println("Man: 'Hey, you look like a warrior. We're wondering if you could possibly help search for our goats'. \nIn exchange, we'll pay you 20 silver coins.");
        response = sc.next();
        if(response.equalsIgnoreCase("n")){
            System.out.println(name + ": No thanks. I have to keep moving. Sorry for your troubles. Good luck.");
            System.out.println("(Continuing walking...)");
            System.out.println("(Suddenly, the village is attacked by" + enemy + "s )");
            System.out.println("Do you choose to [f]ight or [r]un?");
            response = sc.next();
            if(response.equalsIgnoreCase("f")){
                fight(name, weapon, coins, enemy);
            }else{
                run(name, weapon, coins);
            }
        }else{
            System.out.println(name + ": Sure. Can you tell me more? ");
            System.out.println("Man: We saw a thief take them into the forest. You'll need to find them there.");
            forest(name, weapon, coins);
        }

    }
    public static void caves(String name, String weapon, int coins, String enemy, int health, int potions){

    }
    public static void forest(String name, String weapon, int coins, String enemy, int health, int potions){

    }
    public static void dungeons(String name, String weapon, int coins, String enemy, int health, int potions){

    }

    public static int fight(String name, String weapon, int coins, String enemy, int health, int potions){
        Scanner sc = new Scanner(System.in);
        int HP = health;
        System.out.println("You're about to fight a[n] " + enemy);
        System.out.println("Get your weapon ready");
        HP = attack(name, weapon, coins, enemy, health, potions);
        System.out.println("You need to recover. Would you like to use a potion? [y] or [n]");
        if(sc.next().equalsIgnoreCase("y")){
            potions -= 1;
            HP += 20;
            if(HP > 100){
               HP = 100;
            }
        }
        run(name, weapon, coins, enemy, HP, potions);
        return HP;


    }

    public static void run(String name, String weapon, int coins, String enemy, int health, int potions){

    }

    public static int attack(String name, String weapon, int coins, String enemy, int health, int potions){
        int HP = 100;
        int attackPoints = (int)(Math.random() * (25 - 15) + 1);
        int enemyHP = (int)(Math.random() * (80 - 65) + 1);
        System.out.println(name + " HP: " + HP + " | Enemy HP: " + enemyHP);
        while(HP > 0 || enemyHP > 0) {
            System.out.println(name + " attacks");
            enemyHP -= attackPoints;
            System.out.println("Enemy HP: " + enemyHP);
            System.out.println("Enemy attacks you");
            HP -= attackPoints;
            System.out.println(name + " HP: " + HP);
        }
        System.out.println(name + " HP: " + HP + " | Enemy HP: " + enemyHP);
        if(HP == 0){
            System.out.println("GAME OVER.");
            System.exit(0);
        }else{
            System.out.println("You killed the enemy.");
            return HP;
        }

    }

    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }


}
