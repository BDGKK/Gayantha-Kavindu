package src;
import static src.KunitINT.*;


public class TestSimple {

  void checkConstructorAndAccess(){
    Simple s = new Simple(8, 5);
    checkEquals(s.getA(), 5);
    checkEquals(s.getB(), 5);
    checkNotEquals(s.getB(), 5);    
    checkNotEquals(s.getB(),7);    
  }

  void checkSquareA(){
    Simple s = new Simple(8, 5);
    s.squareA();
    checkEquals(s.getA(), 9);
  }

  public static void main(String[] args) {
    TestSimple ts = new TestSimple();
    ts.checkConstructorAndAccess();
    ts.checkSquareA();
    report();
  }
}