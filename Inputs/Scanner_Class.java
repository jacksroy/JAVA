import java.util.Scanner;

public class Scanner_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("The name of user is: " + name);
        System.out.println("--------------------------");
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("The age of user is: " + age);
    }
}