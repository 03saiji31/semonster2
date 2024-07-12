package semonster2;

public class Monster {
  private String name;
  private int rare;

  Monster(int nnum, int rnum) {
    this.name = this.summonMonster(nnum);
    this.rare = rnum;
  }

  String summonMonster(int mnunber) {
    String monsters[] = {"スライム", "サハギン", "ドラゴン", "デュラハン", "シーサーペント"};

    return monsters[mnunber];
  }

  @Override
  public String toString() {

    return this.name + ":レア度[" + this.rare + "]\n";
  }
}
