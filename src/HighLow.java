import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNum;
        int guesses = 0;
        System.out.println("Welcome to the HighLow Game.");
        System.out.println("The objective is to guess the number the game has generated with the least amount of guesses.");
        System.out.println("Press [s] to begin.");
        if(!sc.next().equalsIgnoreCase("s")){
            System.out.println("Game Over.");
        }else{
            randomNum = (int)((Math.random() * 100) + 1);
            System.out.println("Game is generating random number...");
            guesses = game(randomNum);
            if(guesses > 0){
                System.out.println("It took you " + guesses + " guesses to finish the game.");
            }
        }
        
    }

    public static int game(int randomNum){
        int guesses = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number: ");

        try {
            int userInput = sc.nextInt();
            while (userInput != randomNum) {
                if (userInput == randomNum) {
                    ++guesses;
                    System.out.println("GOOD GUESS! It took you " + guesses + " guesses.");
                    break;
                } else if (userInput > randomNum) {
                    ++guesses;
                    System.out.println("LOWER");
                    userInput = sc.nextInt();
                } else {
                    ++guesses;
                    System.out.println("HIGHER");
                    userInput = sc.nextInt();
                }
            }
        }catch(Exception e){
            System.out.println("Invalid Response. Game Over. Restart the Game.");
            e.printStackTrace();
        }
            return guesses;
    }


}
