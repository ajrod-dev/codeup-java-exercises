package movies;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] movieArr = getAllMovies();
        System.out.println("Welcome to Movie Application.");
        System.out.println("What would you like to do? \n");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category\n");
        System.out.println("Enter your choice: ");
//        int input = sc.nextInt();
//
//        switch(input){
//            case 0:
//                System.out.println("Thanks for coming");
//                System.exit(0);
//                break;
//            case 1:
//                for(Movie movie : movieArr){
//                    System.out.println(movie.getName());
//                }
//                break;
//            case 2:
//                for(Movie movie : movieArr){
//                    System.out.println();
//                }
//
//        }






    }

    public static Movie[] getAllMovies() {
         Movie[] result = MoviesArray.findAll();
         Movie[] returnedArr = new Movie[result.length];
         for(Movie movie : result){
             returnedArr = Arrays.copyOf(result, result.length);
         }
         return returnedArr;
    }

    public static Movie[] getMovieByGenre(String genre){
        int count = 0;
        Movie[] result = MoviesArray.findAll();
        for(Movie movie : result){
            if(movie.getCategory().equalsIgnoreCase(genre)){
                count++;
            }
        }
        Movie[] returnedArr = new Movie[count];
        for(Movie movie : result){
            if(movie.getCategory().equalsIgnoreCase(genre)){
                returnedArr = Arrays.copyOf(result, result.length);
            }
        }
        return returnedArr;
    }

}
