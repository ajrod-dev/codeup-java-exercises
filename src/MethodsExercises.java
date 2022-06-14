import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        int x = 2;
//        int y = 10;
//        addition(x, y);
//        subtraction(x,y);
//        System.out.println(x + " * " + y + " = " + multiplication(x, y));
//        division(x, y);
//        modulus(x, y);

//         Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.
//        System.out.println("Enter a number between 1 and 10: ");
//
//        int userNum = getInteger(1,10);
//        System.out.println("You entered " + userNum);

        // Calculate the factorial of a number.
//        factorial();

        // Create an application that simulates dice rolling.
//        rollDice();

        // Prime
//        int num = 10;
//        boolean primeNum = isPrime(num);
//        if (primeNum){
//            System.out.println(num + " is a Prime number.");
//        }else{
//            System.out.println(num + " is NOT a Prime number.");
//        }

    }
    public static void rollDice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("We're going to roll a pair of dice. \nPick how many sides each die have: ");
        int sides = sc.nextInt();
        System.out.println("Type 'r' to roll the dice.");
        String response = sc.next();
        while(response.equalsIgnoreCase("r")){
            int firstDie = (int)(Math.random() * (sides) + 1);
            int secondDie = (int)(Math.random() * (sides) + 1);
            System.out.printf("1st Die: %d, 2nd Die: %d\n", firstDie, secondDie);
            System.out.println("Do you wish to roll again? [y] or [n]");
            if(sc.next().equalsIgnoreCase("n")){
                response = "exit";
            }
        }




    }

    public static void factorial(){
        Scanner sc = new Scanner(System.in);
        long result;
        do {
            System.out.println("Enter a number between 1 and 20: ");
            int userNum = sc.nextInt();
            result = factorial(userNum);
            System.out.println("End result: " + result);
            System.out.println("Do you wish to continue? [y] or [n]");
            if(sc.next().equalsIgnoreCase("y")){
                result = 1;
            }
        }while(result == 1);

    }

    public static long factorial(long num){
        if(num == 0){
            return 1;
        }
        else if(num > 20) {
            System.out.println("Please enter a number less than or equal to 20");
            return 0;
        }
        return num * factorial(num - 1);
    }
    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        int userNum = sc.nextInt();
        if(userNum >= min && userNum <= max){
            return userNum;
        }
        System.out.println("The integer you entered is not within range, please enter another: ");
        return getInteger(min, max);
    }

    public static Boolean isPrime(Integer n) {
        boolean response = false;
        for(int i = 1; i <= n; i++){
           if(i == 1 || i == n){
               continue;
           }else if(n % i == 0){
               return false;
           }
        }
        return true;
    }

    public static Integer addition(int x, int y){
        System.out.println(x + " + " + y + " = " + (x + y));
        return x + y;
    }

    public static Integer subtraction(int x, int y){
        System.out.println(x + " - " + y + " = " + (x - y));
        return x - y;
    }

    public static Integer multiplication(int x, int y) {
        int result = 0;
        if(y == 0){
            return 0;
        }else {
            result = x + multiplication(x, y - 1);
        }
        return result;

//        int result = 0;
//        for(int i = 1; i <= y; i++){
//           result += x;
//        }
//        System.out.println(x + " * " + y + " = " + (result));
//        return result;

    }

    public static Integer division(int x, int y){
        try {
            System.out.println(x + " / " + y + " = " + (x / y));
            return x / y;
        }catch(Exception e){
            System.out.println("Can't divide by 0 for the division equation.");
        }
        return 0;
    }

    public static Integer modulus(int x, int y){
        try {
            System.out.println(x + " % " + y + " = " + (x % y));
            return x % y;
        }catch(Exception e){
            System.out.println("Can't divide by 0 for the modulus equation.");
        }
        return 0;
    }
}
