class Demo{

    void Hello(){
        System.out.println("Hello world with No return and No parameter");
        System.out.println("----------------------------------");
    }
    void Bye(int a){
        System.out.println("This is with No return and with Parameter "+a);
        System.out.println("----------------------------------");

    }
    String Good(){
        System.out.println("This is with Return and No paramters ");
        System.out.println("----------------------------------");
        return "This is String return Method";
    }
    int Very(int a,int b){
        System.out.println("----------------------------------");

        System.out.println("This is with Return and with Parameter");
        System.out.println("----------------------------------");
        return a+b;
        

    }

}
class Methods{
    public static void main(String[] args){

        Demo obj = new Demo();
        obj.Hello();
        obj.Bye(10);
        String msg=obj.Good();// we can return in this way by initailsile a variable and print that variable
        System.out.println(msg);
        System.out.println("Result is: " + obj.Very(10,19));// call  return with directly 

    }
}

//output
// PS C:\REWORK\Java> javac Methods.java
// PS C:\REWORK\Java> java Methods
// Hello world with No return and No parameter
// ----------------------------------
// This is with No return and with Parameter 10
// ----------------------------------
// This is with Return and No paramters 
// ----------------------------------
// This is String return Method
// ----------------------------------
// This is with Return and with Parameter
// ----------------------------------
// Result is: 29
