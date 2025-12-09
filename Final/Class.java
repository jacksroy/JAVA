final class P{
     public void show(){
        System.out.println(" Can't be Inherit");
     }

}

// class Q extends P{
//     public void show(){
//         System.out.println(" Class Q");
//     }  // Can't be override the final class 

// }

public class Class {
    public static void main(String[] args) {
        P obj = new P();
        obj.show();
    }

    public static void forName(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'forName'");
    }
}
