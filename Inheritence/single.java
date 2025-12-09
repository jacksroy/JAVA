
class A{  
// parent class or super class or base class
    public int add(int a,int b){

        return a+b;

    }
}

class B extends A{
    // child class or sub class or  derived class  
    //this is a single level inheritance
    public int sub(int a ,int b){
        return a-b;
    }
}


public class single {
    public static void main(String[] args) {
        B obj= new B();// which is last class we need to create that class obj so that we can take all the properties  

        System.out.println("Sum of this Value : "+obj.add(10, 7));
        System.out.println("Different of this Value : "+obj.sub(10, 7));
        
    }
}
