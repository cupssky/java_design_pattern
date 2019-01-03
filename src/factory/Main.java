package factory;

public class Main {

  public static void main(String[] args) {
    //생산지 선언
    TransCreator transCreator = new RealTransCreator();

    //Caller(Main)은 Callee를 직접변수를 선언하지 않고 생성.
    //인터페이스(중간매체, 추상클래스 포함) 통해 생성.
    TransProduct transProduct;

    //교통수단 - 자전거 생성
    transProduct = transCreator.transCreate("bicycle");

    //자전거 기능 이용
    transProduct.useTrans();

    //교통수단 - 택시 생성
    transProduct = transCreator.transCreate("taxi");

    //택시 기능 이용
    transProduct.useTrans();

  }
}
