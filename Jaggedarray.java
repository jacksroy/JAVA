public class Jaggedarray {
    public static void main(String[] args) {
        // this jagged array has no specific columns are in other words no fixed length of columns
        int[][] arr =new int[3][];
        arr[0] =new int[3];//this tell row 0 has 3 columns
        arr[1] =new int[2];
        arr[2] =new int[1];
        arr[0][0] =10;//giving  values to array
        arr[0][1]=65;
        arr[0][2]=98;
        arr[1][0]=76;
        arr[1][1]=66;
        arr[2][0]=99;

        int[][] arr1={
            {12,5,8},
            {12,6},
            {4}
        };
        System.out.println("Total array using for loop");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
        System.out.println("Total array using for each loop");
        for(int i[]:arr1){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
        System.out.println("Total array1 using for each loop");
        for(int i[]:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}

// output
// PS C:\REWORK\Java\arrays> javac Jaggedarray.java
// PS C:\REWORK\Java\arrays> java Jaggedarray      
// Total array using for loop
// 12 5 8 
// 12 6
// 4
// ------------------------------------------
// Total array using for each loop
// 12 5 8
// 12 6
// 4
// ------------------------------------------
// Total array1 using for each loop
// 10 65 98
// 76 66
// 99
