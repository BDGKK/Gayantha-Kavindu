package src;

public class Simple {

  public int a = 40;
  private int b = 50;
  
  public Simple() {
  }
  
  public Simple(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public void squareA(){
    this.a *= this.a;
  }

  private void squareB(){
    this.b *= this.b;
  }

  public int getA() {
    return a;
  }

  private void setA(int a) {
    this.a = a;
  }

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }
  
  public String toString() {
    return String.format("(a:%d, b:%d)", a, b);
  }

}
