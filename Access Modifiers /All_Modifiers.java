class A {
  public int marks = 5;
  private int ma = 10;
  protected int nu = 34; // this works in same class and package and also we can done by crete a sub
                         // class outside package which extends the class can access can do
  int num = 20; // this is by default this default can share same class and same package

  public void show() { // public can Access from any where

    System.out.println("Print : " + marks);

  }
}

class B {
  public void show() {
    // System.out.println(ma); //here we can't access ma variable because it is
    // private the private works in with in the class it self
  }

}

class C extends A  {
  void show1() {
    System.out.println(nu +"   "+ num);
  }
}

public class All {
  public static void main(String[] args) {
    A obj = new A();
    C obj1 = new  C();
    obj.show();
    obj1.show1();
  }


//output
//   PS C:\REWORK\Java\AccessModifiers> javac All.java
// PS C:\REWORK\Java\AccessModifiers> java All.java
// Print : 5
// 34   20
}
