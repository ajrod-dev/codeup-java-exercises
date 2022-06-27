package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GroceryListApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to create a grocery list? ");
        String response = sc.next();
        if(response.equalsIgnoreCase("no")){
            System.out.println("Have a good day then. Bye");
        }else if(response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")){
            System.out.println();
            System.out.println("Great\n\nWould you like to add a new item? ");
        }
    }

    ArrayList<String> itemsByCategory = new ArrayList<>();

//    HashMap<String, itemsByCategory> allItems = new HashMap<>();
}
