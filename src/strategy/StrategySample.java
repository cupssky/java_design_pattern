package strategy;

public class StrategySample {

  public static void main(String[] args) {
    Sett sett = new Sett();
    sett.setSkill(new Haymaker());
    sett.useSkill();

    sett.setSkill(new Facebreaker());
    sett.useSkill();
  }
}
