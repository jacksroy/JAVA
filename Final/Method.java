
class A{
    final public void show(){
         System.out.println(" In Show A");
    }
}

class B extends A{

    // public void show(){  // Cannot be override the final method
    //     System.out.println(" In Show B");
    // }

}

public class Method {
    public static void main(String[] args) {
        A obj = new A();
         obj.show();
    }
}
