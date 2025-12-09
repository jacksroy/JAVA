class Abc{
    int age;
    Abc(){// constructor is created by  same Class name 
        // Constructors were introduced to automatically initialize objects when they’re created.
        //some use this we can initial the values at assigning of variable but it is not standard way to do it java so we use constructors to do it
        age=16;
        System.out.println("Age is :"+age);
    }
}
public class constructor {
    public static void main(String[] args) {
     Abc obj=new Abc();   //object created so constructor it call 
     Abc obj1=new Abc();   //once again constructor is called in the class we has created no.of object then constructor is called no.of times
    }

    
}