import java.util.Random;

public class Monster {
  String name;
  int rare;

  Monster() {
    Random random = new Random();
    int a = random.nextInt(5);
    this.name = this.summonMonster(a);
    this.rare = a;
  }

}
