class A{
    void show(){
        class B{
            void display(){
                System.out.println("Local Inner class");
            }
        }
        B b = new B();  // we need to call object here only other wise it will give error
        b.display();

    }
}

public class Local {
    public static void main(String[] args) {
        A obj = new A();  // after creating object of B we must Also create object of A class
        obj.show();
       }
}
