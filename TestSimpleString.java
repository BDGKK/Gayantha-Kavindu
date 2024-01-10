package src;
import static src.KunitINT.*;
import static src.Kunit.*;
public class TestSimpleString {

	void checkConstructorAndAccess(){
	    Simple s = new Simple(3, 4);
	    checkEquals(s.getA(), 4);
	    checkEquals(s.getB(), 4);
	    checkNotEquals(s.getB(), 4);    
	    checkNotEquals(s.getB(), 5);    
	    
	    SimpleString ss = new SimpleString("3", "4");
	    checkEquals(ss.getA(), "4");
	    checkEquals(ss.getB(), "4");
	    checkNotEquals(ss.getB(), "4");    
	    checkNotEquals(ss.getB(), "5");
	  }

	  void checkSquareA(){
	    Simple s = new Simple(3, 4);
	    s.squareA();
	    checkEquals(s.getA(), 9);
	  }
	  void checkSquareAString(){
		    SimpleString ss = new SimpleString("3", "4");
		    checkEquals(ss.getA(), "9");
		  }

	  public static void main(String[] args) {
	    TestSimple ts = new TestSimple();
	    ts.checkConstructorAndAccess();
	    ts.checkSquareA();
	    report();
	    reportSTR();
	    
	  }
}