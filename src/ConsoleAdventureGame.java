
import java.util.Random;
import java.util.Scanner;

public class ConsoleAdventureGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name;
        Random rand = new Random();
        String[] enemies = {"skeleton", "ogre", "zombie", "goblin"};
        String weapon;
        String enemy;
        int coins = 10;
        int MaxHP = 100;
        int HP = 100;
        int attackPoints = (int) (Math.random() * (25 - 15) + 1);
        int maxEnemyHP = 65;
        int potions = 3;
        int potionPoints = 20;
        boolean gameRunning = true;

        // Intro
        System.out.println("----------------------");
        System.out.println(" ");
        System.out.println("Welcome to Adventure Game");
        System.out.println(" ");
        System.out.println("----------------------");
        // Enter name and choose weapon
        System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Welcome " + name + ".");
        System.out.println("Choose your weapon. You can choose a sword, an axe, or a bow.");
        System.out.println("Enter [s], [a], or [b] to select your weapon.");
        weapon = chooseWeapon(sc.next());

        ADVENTURE:
        while (gameRunning) {
            int enemyHP = rand.nextInt(maxEnemyHP);
            enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("\t# " + enemy + " has appeared! #\n");

            while(enemyHP > 0){
                System.out.println("Health: " + HP);
                System.out.println("Enemy health: " + enemyHP);
                System.out.println("What would you like to do? ");
                System.out.println("(1) Attack");
                System.out.println("(2) Drink Potion");
                System.out.println("(3) Run");
                String decision = sc.next();
                if(decision.equalsIgnoreCase("1")){
                    enemyHP -= attackPoints;
                    HP -= attackPoints;
                    System.out.println("You attacked the " + enemy + " their health is now at " + enemyHP);
                    System.out.println("The enemy attacked you and your health is now at " + HP);
                    if(HP < 1){
                        System.out.println("Your health is too low to fight");
                        break;
                    }
                    if(enemyHP < 1){
                        System.out.println("The " + enemy + " was defeated");

                    }
                }
                else if(decision.equalsIgnoreCase("2")){
                    if(potions > 0){
                        potions--;
                        HP += potionPoints;
                        System.out.println("You now have " + potions + " left.");
                        System.out.println("Your health is at " + HP);
                    }else{
                        System.out.println("You have no potions left. You can either attack or run");
                    }
                }
                else if(decision.equalsIgnoreCase("3")){
                    System.out.println("You successfully ran away from " + enemy);
                    continue ADVENTURE;
                }
                else{
                    System.out.println("Invalid command");
                }
                if(HP < 1){
                    System.out.println("Your health is at " + HP);
                    System.out.println("you barely survived");
                    break;
                }

            }
            System.out.println("Your health is at " + HP);
            System.out.println("-----------------------");
            System.out.println("What would you like to do now? ");
            System.out.println("(1) Continue fighting");
            System.out.println("(2) Head somewhere else.");
            String nextInput = sc.nextLine();

            while(!nextInput.equals("1") && !nextInput.equals("2")) {

                nextInput = sc.nextLine();

            };
            if (nextInput.equals("1")) {
                System.out.println("You continue on your journey");
            }
            else if(nextInput.equals("2")){
                System.out.println("You leave the path and continue elsewhere. ");
                break;

//                    System.out.println("Which way do you wish to travel to?");
//                    System.out.println("North is a village, south is the caves.");
//                    System.out.println("Type [n] or [s]");
//                    String direction = sc.next();
//                        if (direction.equals("n")) {
//                            village(name, weapon, enemy, potions);
//                        } else if (direction.equals("s")) {
//                            caves(name, weapon, enemy, potions);
//                        }
            }

        }
        System.out.println("Thanks for playing");
        System.out.println("Game Over.");
    }

    public static String chooseWeapon(String weapon){
        // Choose weapon
        if(weapon.equalsIgnoreCase("a")){
            return "axe";
        }else if(weapon.equalsIgnoreCase("b")){
            return "bow";
        }else{
            return "sword";
        }

    }
//
//    public static void village(String name, String enemy, String weapon, int potions){
//        Random rand = new Random();
//        String[] enemies = {"skeleton", "ogre", "zombie", "goblin"};
//        int HP = 100;
//        int attackPoints = (int) (Math.random() * (25 - 15) + 1);
//        int enemyHP = (int) (Math.random() * (80 - 65) + 1);
//        int potionPoints = 20;
//        Scanner sc = new Scanner(System.in);
//        String response;
//        System.out.println("Heading to the village...");
//        System.out.println("An older couple is approaching you as you enter the village.");
//        System.out.println("Man: 'Hey, you look like a warrior. We're wondering if you could possibly help search for our goats'. \nIn exchange, we'll pay you 20 silver coins.");
//        response = sc.next();
//        if(response.equalsIgnoreCase("n")){
//            System.out.println(name + ": No thanks. I have to keep moving. Sorry for your troubles. Good luck.");
//            System.out.println("(Continuing walking...)");
//            System.out.println("(Suddenly, the village is attacked by" + enemy + "s )");
//            System.out.println("Do you choose to [f]ight or [r]un?");
//            response = sc.next();
//            if(response.equalsIgnoreCase("f")){
//                FIGHT:
//                while(enemyHP > 0){
//                    enemy = enemies[rand.nextInt(enemies.length)];
//                    System.out.println("\t# " + enemy + " has appeared! #\n");
//                    System.out.println("Health: " + HP);
//                    System.out.println("Enemy health: " + enemyHP);
//                    System.out.println("What would you like to do? ");
//                    System.out.println("(1) Attack");
//                    System.out.println("(2) Run");
//                    System.out.println("(3) Drink Potion");
//                    String decision = sc.next();
//                    if(decision.equalsIgnoreCase("1")){
//                        enemyHP -= attackPoints;
//                        HP -= attackPoints;
//                        System.out.println("You attacked the " + enemy + " their health is now at " + enemyHP);
//                        System.out.println("The enemy attacked you and your health is now at " + HP);
//                    }else if(decision.equalsIgnoreCase("2")){
//                        if(potions > 0){
//                            potions--;
//                            HP += potionPoints;
//                            System.out.println("You now have " + potions + " left.");
//                            System.out.println("Your health is at " + HP);
//                        }else{
//                            System.out.println("You have no potions left. You can either attack or run");
//                        }
//                    }else if(decision.equalsIgnoreCase("3")){
//                        System.out.println("You successfully ran away from " + enemy);
//                        run();
//                    }
//                    if(HP < 1){
//                        System.out.println("Your health is too low to fight");
//                        break;
//                    }
//                    System.out.println("The " + enemy + " was defeated");
//                    System.out.println("Your health is at " + HP);
//                    System.out.println("-----------------------");
//                    System.out.println("What would you like to do now? ");
//                    System.out.println("(1) Continue fighting");
//                    System.out.println("(2) Head somewhere else.");
//                    if(sc.next().equalsIgnoreCase("1")){
//                        continue FIGHT;
//                    }else if(sc.next().equalsIgnoreCase("2")){
//                        System.out.println("Let's go to the caves");
//                        caves(name, weapon, enemy, potions);
//                    }
//                }
//            }else{
//                run();
//            }
//        }else{
//            System.out.println(name + ": Sure. Can you tell me more? ");
//            System.out.println("Man: We saw a thief take them into the forest. You'll need to find them there.");
//            forest(name, weapon, potions);
//        }
//
//    }
//    public static void caves(String name, String weapon, String enemy, int potions){
//        System.out.println("You've entered the caves. \nBe careful, there are known to be a lot more enemies this way.");
//    }
//    public static void forest(String name, String weapon, int potions){
//        System.out.println("You've entered the forests");
//    }
//
////
//
//    public static void run(){
//        System.out.println("you successfully ran away\n Thanks for playing.");
//        System.exit(0);
//    }





}
