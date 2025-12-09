public class Problem8 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.printf("%3d", i*j); //Here i use printf % → starts the format specifier and d → stands for decimal integer and 3 → minimum width of the field → ensures the number takes at least 3 spaces
            }
            System.out.println();
        }
    }
}


// output  
//   1  2  3  4  5
//   2  4  6  8 10
//   3  6  9 12 15
//   4  8 12 16 20
//   5 10 15 20 25