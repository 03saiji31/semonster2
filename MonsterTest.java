import org.junit.Test;
import static org.junit.Assert.*;

public class MonsterTest {

  @Test
  public void testMonsterToString() {
    Monster classUnderTest = new Monster();
    assertNotNull("スライム:レア度[0]\n", classUnderTest.toString());
  }
}
