// lambda expression only work with the Functional Interface 
// lambda expression uses the (  ->  )  symbol
//short hand syntax for implementing the abstract method of a functional interface
@FunctionalInterface
interface A{
    void show();
}

@FunctionalInterface
interface B{  
    void display(int a);
}

@FunctionalInterface
interface C{
    void calc(int a , int b);

}

@FunctionalInterface
interface D{
    int mul(int a , int b);
}

public class Types {
    public static void main(String[] args) {
        A obj = () -> {
            System.out.println("No Parameter expression");
        };
        obj.show();

        B obj1 = (a) -> {  // we can also write as (int a) -> {  but we already know it is int so lambda expression infers it automatically
            System.out.println("One Parameter lambda Expression : " + a);
        };
        obj1.display(18);

        C obj2 = (a,b) -> {
            System.out.println("Two Parameter lambda Expression : " + (a+b));
        };
        obj2.calc(18,24);

        D obj3 = (a,b) -> a*b;  // this is return type lambda expression
        // we can also do it like
        //D obj3 = (a,b) -> {  return a*b; };
        System.out.println("Lambda Expression with return  : "+obj3.mul(18, 24));


    }
    
}
