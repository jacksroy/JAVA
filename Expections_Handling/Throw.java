public class Throw {
    public static void main(String[] args) {
        
    
    int a =18;
    int b=24;

    try{
        int result = a/b;  // here 18/24 the actual result is 0.75 but because both are integers the result will be 0  
        // for for this reason we use throw to throw the exception manually
        if(result == 0){
            throw new Exception("Result is zero. Division result is less than 1.");  // here we throw the exception manually using throw keyword and that exception need to be catch in catch block it work only when we give the same exception type in catch block
            // Here the exception name is "Exception" 
        }

        System.out.println("Result: " + result);
    }
    catch(Exception e){
        System.out.println("Exception Occurs. " + e.getMessage());  
    }
}
}
