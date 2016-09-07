import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Player one, enter rock, paper, or scissors.");
    String playerOneInput = new String(console.readPassword());
    System.out.println("Player two, enter rock, paper, or scissors.");
    String playerTwoInput = new String(console.readPassword());

    Rps rps = new Rps();

    String winner = rps.whoWon(playerOneInput.toLowerCase(), playerTwoInput.toLowerCase());

    if(winner.equals(playerOneInput)){
      System.out.println("Player one wins with " + playerOneInput);
    } else if (winner.equals(playerTwoInput)){
      System.out.println("Player two wins with " + playerTwoInput);
    } else {
      System.out.println("It's a tie!");
    }
  }
}
