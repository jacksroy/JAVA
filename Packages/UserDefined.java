package UserDefine;  //user defined package 

public class B {
    public void show(){
        System.out.println("UserDefine Package and Class is A");
    }
}


// import the user defined Package
import UserDefine.B;

public class UserDefined {
   public UserDefined() {
   }

   public static void main(String[] var0) {
      B var1 = new B();
      var1.show();
   }
}


// //output
// PS C:\REWORK\Java\Packages> javac UserDefined.java
// PS C:\REWORK\Java\Packages> java UserDefined
// UserDefine Package and Class is A

