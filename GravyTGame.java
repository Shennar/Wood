package gravyt;

import java.util.Scanner;

public class GravyTGame {
    public static void main(String[] args) {
        Game newGame = new Game();
        newGame.showRules();
        Scanner inputScanner = new Scanner(System.in);
        boolean gameTypeChosen = true;
        do {
            try {
                System.out.println("Please choose game type:");
                System.out.println("1: Human VS PC");
                System.out.println("2: Human VS Human");
                System.out.println("3: PC VS PC");
                System.out.print("Enter your choice:");
                String inputChoice = inputScanner.nextLine();
                int choice = Integer.parseInt(inputChoice);
                switch (choice) {
                    case 1: {
                        newGame.setPlayer1(new HumanPlayer());
                        newGame.setPlayer2(new PCPlayer());
                        break;
                    }
                    case 2: {
                        newGame.setPlayer1(new HumanPlayer());
                        newGame.getPlayer1().setPlayerName("1st "+newGame.getPlayer1().getPlayerName());
                        newGame.setPlayer2(new HumanPlayer());
                        newGame.getPlayer2().setPlayerName("2nd "+newGame.getPlayer2().getPlayerName());
                        break;
                    }
                    case 3: {
                        newGame.setPlayer1(new PCPlayer());
                        newGame.getPlayer1().setPlayerName("1st "+newGame.getPlayer1().getPlayerName());
                        newGame.setPlayer2(new PCPlayer());
                        newGame.getPlayer2().setPlayerName("2nd "+newGame.getPlayer2().getPlayerName());
                        break;
                    }
                    default: {
                        gameTypeChosen = false;
                        System.out.println("Invalid choice. Try again.");
                    }
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
            }
        } while (!gameTypeChosen);
        newGame.startGame();
        inputScanner.close();
    }
}
