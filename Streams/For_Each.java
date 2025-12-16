import java.util.Arrays;
import java.util.List;

public class For_Each {
    public static void main(String[] args) {
        List <Integer> num = Arrays.asList(3,6,9,3,1,9); // we can also add the elements like this also 
      //   num.add(98); //way 2 to add the elements 
      System.out.println(num);
      System.out.println("---------------------");


      num.forEach(n -> System.out.println(n));  // Another way to print the collections using foreach method 
      System.out.println("---------------------------------");




         for(int i=1; i< num.size();i++){  // we can print using normal loop
            System.out.println(num.get(i));
         }
         System.out.println("-----------------------------");

         for(int n: num){  // we can print by using for each loop or Enhanced for loop 
            System.out.println(n);
         }
         System.out.println("-------------------------------");

    }
}
