import java.util.ArrayList;
import java.util.List;

class Array_L {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<Integer>(); // here <Integer> is used tell the type if we not define it it by default is object 
        num.add(5);  //  This add Method is used to add the elements 
        num.add(18);
        num.add(24);
        System.out.println(num);

        for (int n : num) {
            System.out.println(n);  // we use enhance for loop to print one by one element 
        }

        System.out.println(num.get(2));  //  this method id used to get the element by index value
        num.add(1,46);  // we use top add the element at particular index 
        System.out.println(num);

        System.out.println(num.indexOf(18));  // use to find index of the element 

        System.out.println(num.set(1, 60));  // use to change the element of the particular index value 
        System.out.println(num);
        num.remove(1);// use to remove the element by index 
        System.out.println(num);
        num.remove(Integer.valueOf(10));    // remove by value
        System.out.println(num);
       System.out.println( num.size());  // size of array list
       System.out.println(num.isEmpty()); // check is the list is empty or not  gives o/p as bool values
       System.out.println(num.contains(78)); // Check weather the element is contain in list or not  give bool values

    }
}