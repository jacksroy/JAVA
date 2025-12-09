class A{
    public void show(){
        System.out.println("In A");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B");
    }
}

class C extends A{
    public void show(){
        System.out.println("In C");
    }
}

public class Runtime {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        // here show in  class A is called



        obj =new B();
        obj.show();  //here now obj is dis-linked with class A and now linking to Class B
        
        obj = new C();  // same like B 
        // this is called Runtime polymorphism  or Dynamic Method dispatch    (Note : we need to use inheritance to achieve it )
        obj.show();
    }
}
