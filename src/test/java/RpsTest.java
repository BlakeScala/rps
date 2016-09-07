import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class RpsTest{
  //REMEMBER TO RENAME!!!!!!1!one!
  @Test
  public void whoWon_rockVsScissors_String() {
    Rps testRps = new Rps();
    String expected = "rock";
    assertEquals(expected, testRps.whoWon("rock", "scissors"));
  }
  @Test
  public void whoWon_paperVsScissors_String() {
    Rps testRps = new Rps();
    String expected = "scissors";
    assertEquals(expected, testRps.whoWon("paper", "scissors"));
  }
  @Test
  public void whoWon_paperVsrock_String() {
    Rps testRps = new Rps();
    String expected = "paper";
    assertEquals(expected, testRps.whoWon("paper", "rock"));
  }
  @Test
  public void whoWon_paperVspaper_String() {
    Rps testRps = new Rps();
    String expected = "tie";
    assertEquals(expected, testRps.whoWon("paper", "paper"));
  }

  @Test
  public void computerChooses_shouldBeAString_true(){
    Rps testRps = new Rps();
    String computerChoice = testRps.computerChooses();
    assertEquals(true, !computerChoice.isEmpty());
  }
}
