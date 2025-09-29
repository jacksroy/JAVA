public class Arrays {
    public static void main(String args[]){
        int[] marks={25,98,76,66,45};//basic array creation
        System.out.println("Before update:"+marks[0]);
        System.out.println("Before update:"+marks[2]);
        marks[2]=89;//update value of index by 76 to 89
        marks[0]=11;//update of array element
        System.out.println("Arrays list");
        System.out.println("updated value:"+marks[0]);//print array by index value
        System.out.println(marks[1]);
        System.out.println("updated value:"+marks[2]);
        System.out.println(marks[3]);//normal printing of value without any value
        int[] marks1=new int[3];//array using new keyword
        marks1[0] = 35;
        marks1[1] =66;
        marks1[2] =77;
        for(int i=0;i<=marks1.length;i++){//using for loop to print total array
            System.out.println("Array list:"+i);
        }
        System.out.println("-------------------Another Way is For Each loop -------------");
        for(int i: marks1){
            System.out.println("Array list using for each loop:"+i);//for each loop to print all array 
        }
    }
}

//output
// PS C:\REWORK\Java> javac Arrays.java
// PS C:\REWORK\Java> java Arrays
// Before update:25
// Before update:76
// Arrays list
// updated value:11
// 98
// updated value:89
// 66
// Array list:0
// Array list:1
// Array list:2
// Array list:3
// -------------------Another Way is For Each loop -------------
// Array list using for each loop:35
// Array list using for each loop:66
// Array list using for each loop:77
