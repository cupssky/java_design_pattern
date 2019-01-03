package singleton;

public class Main {

  public static void main(String[] args) {
    //객체 1 생성
    SystemSpeaker systemSpeaker1 = SystemSpeaker.getInstance();
    //객체 2 생성
    SystemSpeaker systemSpeaker2 = SystemSpeaker.getInstance();

    //객체 주소 비교 (같은 주소가 나온다)
    System.out.println(systemSpeaker1);
    System.out.println(systemSpeaker2);

    //객체의 attribute값 읽어오기
    System.out.println(systemSpeaker1.systemVol);
    System.out.println(systemSpeaker2.systemVol);
  }
}
