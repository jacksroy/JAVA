abstract class Car{  // abstract class can have both abstract and normal method and also can have only one type method also like it can be all normal methods or it can have all abstract methods
    
    // abstract class can't able to create the object 
    
    abstract void drive();  //just be declare not write code inside it this is called abstract method and abstract method should be inside the abstract class

    public void test(){
        System.out.println("Tested....");
    }

}

class BMW  extends Car{  //concrete class 
    public void drive(){
        System.out.println("Driving ...");   // this  class must be write the code of the declare abstract class in the parent class 
          
    }
}

public class Abstract {
    public static void main(String[] args) {
        BMW obj = new BMW();
        obj.drive();
        obj.test();
    }
}
