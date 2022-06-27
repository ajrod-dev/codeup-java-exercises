package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString(){
        System.out.println("Enter a string: ");
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Yes or No?");
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")){
            return true;
        }else{
            return false;
        }
    }

    public int getInt(int min, int max){
        System.out.println("Enter a whole number within range: ");
        int num = 0;
        try {
            num = Integer.valueOf(getString());
            if(num < min || num > max){
               throw new Exception("Not within range");
            }
        }catch(Exception NumberFormatException){
            System.out.println("Not a valid input");
            num = getInt(min, max);
        }
        return num;
    }

    public int getInt(){
        int num = 0;
        System.out.println("Enter a whole number: ");
        try {
            num = Integer.valueOf(getString());
        }catch(Exception NumberFormatException){
            System.out.println("Not a valid input");
        }
        return num;
    }

    public double getDouble(double min, double max){
        System.out.println("Enter a decimal number within range: ");
        double num = 0;
        try {
            num = Double.valueOf(getString());
            if(num < min || num > max){
                throw new Exception("Not within range");
            }
        }catch(Exception NumberFormatException){
            System.out.println("Not a valid input");
            num = getDouble(min, max);
        }
        return num;
    }

    public double getDouble() {
        double num = 0;
        System.out.println("Enter a decimal number: ");
        try {
            num = Double.valueOf(getString());
        } catch (Exception NumberFormatException) {
            System.out.println("Not a valid input");
        }
        return num;
    }

    public int getBinary(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String userInput = sc.next();
        int num = 0;
        try {
            num = Integer.valueOf(userInput, 2);
            System.out.println("\n" + userInput + " in base 2 or binary is: ");

        }catch(Exception NumberFormatException){
            System.out.println("Invalid input");
            num = getBinary();
        }
        return num;
    }

    public int getHex(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number: ");
        String userInput = sc.next();
        int num = 0;
        try {
            num = Integer.valueOf(userInput, 16);
            System.out.println("\n" + userInput + " in base 16 or hex is: ");

        }catch(Exception NumberFormatException){
            System.out.println("Invalid input");
            num = getHex();
        }
        return num;
    }

}
