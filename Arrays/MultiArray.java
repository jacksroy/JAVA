public class MultiArray {
    public static void main(String[] args) {
        int[][] arr={
            {1,9,6},
            {1,6,45},
            {8,9,4}//direct initialization
        };
        int [][] arr1=new int[2][2];
        arr1[0][0]=10;
        arr1[1][0]=98;
        arr1[1][1]=101;  //using new keyword 

        System.out.println("Printing 1st row 3rd col element:   "+arr[0][2]);//print value using index value
        System.out.println("-------------------------------------------");
        System.out.println("Printing all Elements in Array");
        for(int i=0;i<arr.length;i++){ //printing all elements in array
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            System.out.println("length of row:"+arr.length +"length of column:"+ arr[i].length);
        }
        System.out.println("-------------------------------------------");
        System.out.println(" Before updating Printing 1st row 3rd col element:   "+arr[0][2]);
        System.out.println("-------------------------------------------");
         
        arr[0][2]=45;
        System.out.println(" After updating Printing 1st row 3rd col element:   "+arr[0][2]);//print value after update
        System.out.println("-------------------------------------------");
        System.out.println("Length this gives only row size:"+arr.length);//gives only row size
        System.out.println("-------------------------------------------");
        System.out.println("Printing array 1 using for each loop");
        for(int[] row:arr1){//print values of array using for each loop
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }

    }
}
