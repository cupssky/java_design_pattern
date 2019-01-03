package factory;

//추상 클래스.
//Caller Interface 혹은 abstract 클래스를 통해, Callee와 연결해야된다.
public abstract class TransCreator {

  //TransProduct 생성하는 팩토리 메소드
  public abstract TransProduct transCreate(String trans);
}
