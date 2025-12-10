class A{
    static int num =10;
    public void show(){
        System.out.println("Outer class");
    }
    static class B{
        void display(){
            System.out.println("Static class can access only static members of outer class");
            System.out.println("Only can access the static methods: "+num);
        }
    }

}


public class Static_Class {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        A.B obj1 = new A.B();
        obj1.display();
    }
    
}
