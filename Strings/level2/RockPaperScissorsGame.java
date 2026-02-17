package com.gla.Strings.level2;
import java.util.Scanner;
public class RockPaperScissorsGame {
    // (b) Method to generate computer choice
    public static String getComputerChoice() {
        int random = (int)(Math.random() * 3);

        if (random == 0)
            return "Rock";
        else if (random == 1)
            return "Paper";
        else
            return "Scissors";
    }

    // (c) Method to determine winner
    public static String findWinner(String user, String computer) {

        if (user.equalsIgnoreCase(computer)) {
            return "Draw";
        }

        if ((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
                (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
                (user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // (d) Method to calculate statistics
    public static String[][] calculateStats(int userWins, int compWins, int totalGames) {

        String[][] stats = new String[2][3];

        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (compWins * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f%%", userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f%%", compPercent);

        return stats;
    }

    // (e) Method to display results
    public static void displayResults(String[][] gameResults, String[][] stats) {

        System.out.println("\nGame Results:");
        System.out.println("--------------------------------------------------");
        System.out.println("Game\tUser\tComputer\tWinner");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" +
                    gameResults[i][0] + "\t" +
                    gameResults[i][1] + "\t\t" +
                    gameResults[i][2]);
        }

        System.out.println("--------------------------------------------------");

        System.out.println("\nStatistics:");
        System.out.println("---------------------------------");
        System.out.println("Player\tWins\tWin %");
        System.out.println("---------------------------------");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2]);
        }

        System.out.println("---------------------------------");
    }

    // (f) Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int totalGames = sc.nextInt();
        sc.nextLine(); // consume newline

        String[][] gameResults = new String[totalGames][3];

        int userWins = 0;
        int compWins = 0;

        for (int i = 0; i < totalGames; i++) {

            System.out.print("\nEnter your choice (Rock/Paper/Scissors): ");
            String userChoice = sc.nextLine();

            String computerChoice = getComputerChoice();

            String winner = findWinner(userChoice, computerChoice);

            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                compWins++;

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, totalGames);

        displayResults(gameResults, stats);

        sc.close();
    }
}
