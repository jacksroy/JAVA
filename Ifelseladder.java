public class Ifelseladder {
    public static void main(String args[]){
        int marks =79;
        //If-Else-if ladder
        if(marks>=90)
        System.out.println("Grade A");
        else if(marks>=75)
        System.out.println("Grade B");
        else if(marks>=50)
        System.out.println("Grade C");
        else
        System.out.println("Fail");

    }
}
// output
// PS C:\REWORK\Java> javac Ifelseladder.java
// PS C:\REWORK\Java> java Ifelseladder
// Grade B
