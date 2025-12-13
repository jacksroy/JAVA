import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;  // we must Declare this IOException for handling input output exceptions

public class Buffer_Input {
    public static void main(String[] args) throws IOException { // and we need to declare IOException here also
        System.out.println(" Taking input from user using buffer reader");

        InputStreamReader in = new InputStreamReader(System.in); // here in is object of inputstreamreader class  
        // BufferedReader br = new BufferedReader( new InputStreamReader(System.in)); 
        // This is another way to create object of bufferedreader class
        
        
        
        // here br is object of bufferedreader class and we need
        BufferedReader br =new BufferedReader(in); // here br is object of bufferedreader class and we need to pass object of inputstreamreader class as parameter

        String name = br.readLine(); // readLine() method is used to take string input from user
        System.out.println("The name of user is: " + name);

        System.out.println("--------------------------");

        int num = Integer.parseInt(br.readLine()); // to take integer input from user we need to use parseInt() method of Integer class
        System.out.println("The number entered by user is: " + num);

        System.out.println("--------------------------");
        double dou = Double.parseDouble(br.readLine()); // to take double input from user we need to use parseDouble() method of Double class
        System.out.println("The double entered by user is: " + dou);
    }
}
