public class HelloWorld {
    public static void main(String[] args){
//        System.out.println("Hello World");
        float newFloat = 2.1f;
        double newDbl = 3.145678;
        System.out.printf("Float: %.3f%n", newFloat);
        System.out.printf("Double: %.2f%n", newDbl);


        // Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 7;
//        System.out.println("1.) My favorite number is: " + myFavoriteNumber);
        // Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "Hello Alex!";
//        System.out.println("2.) " + myString);
        // Change your code to assign a character value to myString. What do you notice?
        // myString = 'a';

        // Change your code to assign the value 3.14159 to myString. What happens?
        // myString = 3.14159;

        //Declare a long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        long myNumber;
        // System.out.println(myNumber);

        //Change your code to assign the value 3.14 to myNumber. What do you notice?
        //  myNumber = 3.14;

        // Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        // myNumber = 123L;
        // System.out.println(myNumber);

        // Change your code to assign the value 123 to myNumber.
        // myNumber = 123;
        // System.out.println(myNumber);

//        float myNumber = 3.14;

        // Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

        float myNewNumber = (float) 3.14;
        /* What is the difference between the above code blocks? Explain why the code outputs what it does.
        * Answer: The first code block adds a 1 after it prints out x. The 2nd block adds, then prints out x
        *       int x = 5;
        *       System.out.println(x++);
                System.out.println(x);
        */

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

        // Try to create a variable named class. What happens?
        // Class is a reserved keyword

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        /* Rewrite
        *        int x = 4;
        *         x = x + 5;
        *        Answer: x += 5
        */

        /*          int x = 3;
         *          int y = 4;
         *          y = y * x;
         *          Answer: y *= x
         */

        /*          int x = 10;
         *          int y = 2;
         *          x = x / y;
         *          y = y - x;
         *          Answer: x /= y
         *          Answer: y -= x
         */

        System.out.println(Integer.MAX_VALUE);

        String name = "codeup";
        System.out.printf("Hello there, %s. Nice to see you.%n", name);


    }
}
