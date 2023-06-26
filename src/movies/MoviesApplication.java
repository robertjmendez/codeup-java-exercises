package movies;

import util.Input;

public class MoviesApplication {
    // Method to print out all movies in the array
    private static void viewAllMovies() {
        // Get all movies
        Movie[] movies = MoviesArray.findAll();
        System.out.println("List of all movies:");
        // Iterate through each movie and print its name and category
        for (Movie movie : movies) {
            System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
        System.out.println();
    }
    // Method to print out movies from a specific category
    private static void viewMoviesByCategory(String category) {
        // Get all movies
        Movie[] movies = MoviesArray.findAll();
        System.out.println("Movies in the " + category + " category:");
        // Iterate through each movie and if it matches the category, print its name
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                System.out.println(movie.getName());
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Create an instance of the Input class
        Input input = new Input();
        // Print out menu options
        System.out.println("What would you like to do?\n");
        System.out.println("0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n");

        int choice;
        // Loop until the user chooses to exit
        do {
            // Get user's choice
            choice = input.getInt();
            System.out.println();
            // Handle user's choice
            switch (choice) {
                case 0 -> System.out.println("Exiting the application...");
                case 1 -> viewAllMovies();
                case 2 -> viewMoviesByCategory("animated");
                case 3 -> viewMoviesByCategory("drama");
                case 4 -> viewMoviesByCategory("horror");
                case 5 -> viewMoviesByCategory("scifi");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);
    }
}
