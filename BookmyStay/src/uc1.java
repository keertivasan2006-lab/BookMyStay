/**
 * Entry point for the BookMyStay Hotel Booking application.
 * Displays a welcome message with application name and version.
 *
 * @author YourName
 * @version 1.0
 */
class BookmyStay {

    // Application constants
    private static final String APP_NAME = "BookMyStay - Hotel Booking System";
    private static final String VERSION = "v1.0";

    /**
     * Main method - starting point of the application
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        printWelcomeMessage();
    }

    /**
     * Prints the welcome message to the console
     */
    private static void printWelcomeMessage() {

        System.out.println("======================================");
        System.out.println(" Welcome to " + APP_NAME + " " + VERSION);
        System.out.println("======================================");
        System.out.println("Application started successfully.");
        System.out.println("Thank you for choosing BookMyStay!");
    }
}