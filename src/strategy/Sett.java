package strategy;

public class Sett {

  private Skill skill;

  public void useSkill() {
    skill.use();
  }

  public void setSkill(Skill skill) {
    this.skill = skill;
  }
}
