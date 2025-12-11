interface A{
    void show();  //methods are by default abstract and public  

}
interface B{
    int num =89; //variables are by default static and final
    void display();  //methods are by default abstract and public
}
class C implements A, B{
    public void show(){
        System.out.println("Show method ");
    }
    public void display(){
        System.out.println("Display method ");
    }
}
 // this is multiple inheritance using interfaces
public class Interfaces {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
        System.out.println("Value of num: " + C.num);// we can access num using class name  because it is static
    }
}
