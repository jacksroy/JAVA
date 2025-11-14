import java.util.Scanner;  //import user defined packages

public class BuiltIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value : ");
        int num = sc.nextInt();
        System.out.println("Print Value : "+ num);

        System.out.println("We are using the Built in Package here java.util.Scanner package");
    }
}

// output
// PS C:\REWORK\Java\Packages> javac BuiltIn.java 
// PS C:\REWORK\Java\Packages> java BuiltIn
// Enter the Value : 
// 87
// Print Value : 87
// We are using the Built in Package here java.util.Scanner package
