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
        int num = scanner.nextInt();
        while(num < min || num > max){
            System.out.println("Enter a whole number within range: ");
            num = scanner.nextInt();
        }
        return num;
    }

    public int getInt(){
        System.out.println("Enter a whole number: ");
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        System.out.println("Enter a decimal number within range: ");
        double num = scanner.nextDouble();
        while(num < min || num > max){
            System.out.println("Enter a number within range.");
            num = scanner.nextDouble();
        }
        return num;
    }

    public double getDouble(){
        System.out.println("Enter a decimal number: ");
        return scanner.nextDouble();
    }




}
