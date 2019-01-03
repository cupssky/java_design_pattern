package abfactory;

public class Main {

  public static void main(String[] args) {
    //공장변수 선언
    AbstractFactory abstractFactory;

    //한국공장 객체 선언
    abstractFactory = new KoreaFactory();

    //햄, 빵
    HamProduct hamProduct;
    BreadProduct breadProduct;

    //한국공장에서 생성되는 피자재료를 객체로 생성
    hamProduct = abstractFactory.createHam();
    breadProduct = abstractFactory.creatBread();

    hamProduct.fromTaste();
    breadProduct.fromTaste();

    //미국공장 객체 선언
    abstractFactory = new AmericaFactory();

    //미국공장에서 생성되는 피자재료를 객체로 생성
    hamProduct = abstractFactory.createHam();
    breadProduct = abstractFactory.creatBread();

    hamProduct.fromTaste();
    breadProduct.fromTaste();

  }
}
