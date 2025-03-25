
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[new Random().nextInt(3)];
    }

    public static String determineWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Scissors") && computer.equals("Paper")) ||
            (user.equals("Paper") && computer.equals("Rock"))) return "User Wins";
        return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Rock, Paper, or Scissors: ");
        String userChoice = scanner.next();
        scanner.close();

        String computerChoice = getComputerChoice();
        System.out.println("Computer chose: " + computerChoice);
        System.out.println(determineWinner(userChoice, computerChoice));
    }
}

