package smallprogram.java;

import java.util.Random;
import java.util.Scanner;

public class guessGame {
    static Scanner sc = new Scanner(System.in);

    static void gessnumber() {
        Random random = new Random();
        int numbertoguess = random.nextInt(100) + 1;
        int guess;
        System.out.println("Guess the number:");
        System.out.println("System has selected a number between 1 to 100. Try to guess it.");

        while (true) {
            System.out.print("Enter the number to guess: ");
            guess = sc.nextInt();

            if (guess < numbertoguess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numbertoguess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number correctly.");
                break;
            }
        }
    }

    static void rockPaperScissors() {
        String[] rps = {"Rock", "Paper", "Scissors"};
        Random random = new Random();
        System.out.println("Enter your choice from (Rock, Paper, Scissors):");
        sc.nextLine(); // Consume the newline left-over from nextInt()
        String userChoice = sc.nextLine();

        String computerChoice = rps[random.nextInt(3)];

        System.out.println("Computer's choice: " + computerChoice);

        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
                (userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("1. Guess the number");
            System.out.println("2. Rock Paper Scissors");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    gessnumber();
                    break;
                case 2:
                    rockPaperScissors();
                    break;
                case 3:
                    System.out.println("Exiting the game.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }
}
