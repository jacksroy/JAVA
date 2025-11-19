final class P{
     public void show(){
        System.out.println(" Can't be Inherit");
     }

}

class Q extends P{
    public void show(){
        System.out.println(" Class Q");
    }  // Can't be override the final class 

}

public class Class {
    public static void main(String[] args) {
        P obj = new P();
        obj.show();
    }
}


//output
// PS C:\REWORK\Java\Final> javac Class.java
// Class.java:8: error: cannot inherit from final P
// class Q extends P{
//                 ^
// 1 error
