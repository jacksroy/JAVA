class Jacks extends Exception{ // here we need to create a custom exception by extending the Exception class   or RuntimeException class  
    public Jacks(String msg){
        super(msg);
    }
}


public class Custom {
    public static void main(String[] args) {
        int a = 18;
        int b = 24;
        try {
            int result  = a/b;
            if(result == 0){
                throw new Jacks("Result is zero. Division result is less than 1.");  // here jacks is the custom exception name 
            }
        }
        catch(Jacks e){ // the jacks exception is caught here 
            System.out.println("Custom Exception Occurs. " + e.getMessage());
        }

    }
}
