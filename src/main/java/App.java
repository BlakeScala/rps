import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();
    Rps rps = new Rps();
    String playerOneInput;
    String playerTwoInput;

    System.out.println("Would you like to play against the computer? (Y/N)");
    String againstComputer = console.readLine();
    if(againstComputer.toUpperCase().equals("Y")){
      System.out.println("Please enter rock, paper, or scissors.");
      playerOneInput = new String(console.readLine());
      playerTwoInput = rps.computerChooses();
    } else {
      System.out.println("Player one, enter rock, paper, or scissors.");
      playerOneInput = new String(console.readPassword());
      System.out.println("Player two, enter rock, paper, or scissors.");
      playerTwoInput = new String(console.readPassword());
    }
    System.out.println("Player one: " + playerOneInput);
    System.out.println("Player two/Computer: " + playerTwoInput);
    String winner = rps.whoWon(playerOneInput.toLowerCase(), playerTwoInput.toLowerCase());
    if(winner.equals(playerOneInput)){
      System.out.println("Player one wins with " + playerOneInput);
    } else if (winner.equals(playerTwoInput)){
      System.out.println("Player two/Computer wins with " + playerTwoInput);
    } else {
      System.out.println("It's a tie!");
    }
  }
}
