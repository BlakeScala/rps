//REMEMBER TO RENAME
public class Rps{
  public String whoWon(String player1Shoot, String player2Shoot){
    String[] rpsArray = {"rock", "scissors", "paper"};
    String[] defeatsArray = {"scissors", "paper", "rock"};
    String winner = "";
    for(int i = 0; i < rpsArray.length; i++){
      if((rpsArray[i].equals(player1Shoot) || rpsArray[i].equals(player2Shoot)) && (defeatsArray[i].equals(player1Shoot) || defeatsArray[i].equals(player2Shoot)) ){
        winner = rpsArray[i];
      }
    }
    if(winner.isEmpty()){
      winner = "tie";
    }
    return winner;
  }
}
