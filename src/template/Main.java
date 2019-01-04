package template;

public class Main {

  public static void main(String[] args) {
    Character human = new Human();
    human.makeCharacter();

    Character elf = new Elf();
    elf.makeCharacter();

    Character human2 = new Human(false);
    human2.makeCharacter();
  }
}
