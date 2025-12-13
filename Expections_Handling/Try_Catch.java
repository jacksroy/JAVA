

public class Try_Catch {
    public static void main(String[] args) {
        int a =18;
        int b=0;
    
    try{
        int result = a/b; // try block is used to just try the code is it working fine execute it or if it is error then catch error in catch block 
        // here we has a problem if we has no.of exceptions in try block the first exception will be caught and rest will be ignored even there are also exceptions
    }
    catch(ArithmeticException e){
        System.out.println("Exception Occurs. " + e.getMessage());  // getMessage() method is used to get the description of the exception  
    }

    System.out.println("---------------------------------");

    System.out.println("Multiple try catch block");

    int [] arr = {1,2,3,6,8};

    try{

        System.out.println("value at index 2 : "+arr[2]);
        System.out.println(arr[18]);
        String str = null;  // This also will cause an exception but it will be ignored because the first exception is caught   
        // this will cause NullPointerException and when it throw exception means when the it acts as the first exception then it will throw the exception
        System.out.println(str.length());  // here we see no.of exceptions are there but the second exception is ignore because first exception is caught

    }

    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array Index is out of bound. " + e);
    }

    catch(Exception e){  // when we don't know what type of exception then we can use the exception class to catch all types of exceptions
        System.out.println("Some other exception occurred. " + e.getMessage());
        
    }

    System.out.println("----------------------------------");

    try{
        String str = null;
        System.out.println(str.length());
    }

    catch(Exception e){
        System.out.println("Null Pointer Exception occurred. " + e);  // Make the Exception class to catch all types of exceptions so make sure place that bottom of all catch blocks 
    }

    finally{
        System.out.println("This block is always executed."); // finally block is always executed whether exception occurs or not 
    }
    
}
}
