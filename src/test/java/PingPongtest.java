import org.junit.*;
import static org.junit.Assert.*;

public class PingPongtest {

  @Test
  public void pingOrPongDecision_forNumberDivisibleByThree_ping() {
    PingPong pingPong = new PingPong();
    assertEquals("ping", pingPong.decision(3));
  }

  @Test
  public void pingOrPongDecision_forNumberDivisibleByFive_pong() {
    PingPong pingPong = new PingPong();
    assertEquals("pong", pingPong.decision(5));
  }
}
