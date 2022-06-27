package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public String getString(){
//        System.out.println("Enter a string: ");
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

}
