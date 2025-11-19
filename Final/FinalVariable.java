

public class Variable {
    public static void main(String[] args) {
        int num =8;
        num =19;
        System.out.println(num);

        final int marks= 56;
        marks =76;
        System.out.println(marks);
    }
}


//output
// PS C:\REWORK\Java\Final> javac Variable.java
// PS C:\REWORK\Java\Final> java Variable
// 19
// PS C:\REWORK\Java\Final> javac Variable.java
// Variable.java:10: error: cannot assign a value to final variable marks
//         marks =76;
//         ^
// 1 error
