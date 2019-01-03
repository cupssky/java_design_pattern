package singleton;

public class SystemSpeaker {

  //2. Private static 인스턴스 변수
  private static SystemSpeaker systemSpeaker;

  //원래는 private getter, setter 여야함
  public int systemVol = 5;

  //1. Private 생성자.
  private SystemSpeaker() {

  }

  //3. getInstance 구현
  public static SystemSpeaker getInstance() {
    //실행 횟수가 드물때
    if (systemSpeaker == null) {
      systemSpeaker = new SystemSpeaker();
    }
    return systemSpeaker;
  }
}
