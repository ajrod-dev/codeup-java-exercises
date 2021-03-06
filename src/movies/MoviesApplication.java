package movies;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] movieArr = getAllMovies();
        System.out.println("Welcome to Movie Application.\n");
        // Loop to run until user presses 0
        boolean flag = true;
        while(flag){
            // Menu

            System.out.println("------------------");
            System.out.println("What would you like to do? \n\n");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category\n");
            System.out.println("6 - add a movie (with name and category)\n");
            System.out.println("Enter your choice: \n");
            int input = sc.nextInt();
            switch(input) {
                case 0:
                    System.out.println("Thanks for coming");
                    flag = false;
                    break;
                case 1:
                    System.out.println("------------------");
                    System.out.println("All Movies:       ");
                    System.out.println("------------------");
                    for (Movie movie : movieArr) {
                        System.out.println(movie.getName());
                    }
                    break;
                case 2:
                    System.out.println("------------------");
                    System.out.println("Animated Movies:  ");
                    System.out.println("------------------");
                    getMovieByGenre("animated");
                    break;
                case 3:
                    System.out.println("------------------");
                    System.out.println("Drama Movies:     ");
                    System.out.println("------------------");
                    getMovieByGenre("drama");
                    break;
                case 4:
                    System.out.println("------------------");
                    System.out.println("Horror Movies:    ");
                    System.out.println("------------------");
                    getMovieByGenre("horror");
                    break;
                case 5:
                    System.out.println("------------------");
                    System.out.println("Sci-Fi Movies:    ");
                    System.out.println("------------------");
                    getMovieByGenre("scifi");
                    break;
                case 6:
                    sc.reset();
                    System.out.println("Enter a movie title: ");
                    sc.nextLine();
                    String addedTitle = sc.nextLine();
                    System.out.println("Enter the movie category: ");
                    String addedCategory = sc.next();
                    Movie[] newList = addMovie(MoviesArray.findAll(), addedTitle, addedCategory);
                    System.out.println("------------------");
                    System.out.println("List w/ New Movie Added:    ");
                    System.out.println("------------------");
                    for (Movie movie : newList) {
                        System.out.println(movie.getName());
                    }
                    break;
                default:
                    System.out.println("Thanks for coming by.");
                    flag = false;
                }
            }
    }

    public static Movie[] getAllMovies() {
         Movie[] result = MoviesArray.findAll();
         Movie[] returnedArr = new Movie[result.length];
         for(Movie movie : result){
             returnedArr = Arrays.copyOf(result, result.length);
         }
         return returnedArr;
    }

    public static void getMovieByGenre(String genre) {
        Movie[] result = MoviesArray.findAll();
        for (Movie movie : result) {
            if (!(movie.getCategory().equals(genre))) {
                continue;
            } else {
                System.out.println(movie.getName());
            }
        }
    }

    public static Movie[] addMovie(Movie[] movies, String name, String category){
        Movie[] result = Arrays.copyOf(movies, movies.length + 1);
        result[movies.length] = new Movie(name, category);
        return result;
    }

}
