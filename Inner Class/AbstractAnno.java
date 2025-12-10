abstract class A{
    abstract void display();
    abstract void show();
}   // This is abstract class  and we can create object of abstract class by anonymous inner class only but we cannot create object of abstract class directly   

public class AbstractAnno {
    public static void main(String[] args) {
        A obj = new A(){
            void display(){
                System.out.println("Abstract method display implemented");
            }
            void show(){
                System.out.println("Abstract method show implemented");
            }
        };
        obj.display();
        obj.show();
    }
    
}
