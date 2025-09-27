class Deno{
    void add(){
        System.out.println("Method Overloading 01 ");//method Overloading is a concept of the same Method name and different parameters and it only see about method name and inside it parameters not return type data types not should be same and exact number means we need to change no.of parameters or need to change datatype of that parameter

    }
    int add(int a){
        System.out.println("Method Overloading 02");
        return a;
    }
    int add(int a, int b){
        return a+b;
    }
    double add(double a ,double b, double c){
        return a + b + c;
    }
}
class MethodOverloading{
    public static void main(String[] args){
        Deno obj = new Deno();
        obj.add();
        System.out.println("value of single value" + obj.add(10));
        System.out.println("Result of 2 int values " +obj.add(10,20));
        System.out.println("Result of Double method " + obj.add(1.4,9.8,8.9));

    }
}
//output
// PS C:\REWORK\Java> javac MethodOverloading.java
// PS C:\REWORK\Java> java MethodOverloading      
// Method Overloading 01 
// Method Overloading 02
// value of single value10
// Result of 2 int values 30
// Result of Double method 20.1
