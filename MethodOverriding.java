class A{
    public int add(int a, int b){
        return a+b;
    }
}

class B extends A{
    @Override   // @override is called Annotation  that are use to tell that compiler more clear about code here this annotation tell override the parent class and show output of  present class 
     public int add(int a,int b){
        return a-b +10;
     } 
}


public class MethodOverriding {
    public static void main(String[] args) {

        B obj = new B();
       System.out.println("Value : "+obj.add(14, 87)); //here we has same method and same parameter used in two class  called method overriding here in java the obj of the class gives the priority and override the class A add method and show add method in class B
        
    }
}

// output
// PS C:\REWORK\Java\Methods> javac MethodOverriding.java
// PS C:\REWORK\Java\Methods> java MethodOverriding
// Value : -63
