class Encap{
    private int bank_balance=6500;
    String bank_name;
    //private is used to not to share the data it will share data within the class only
    int getData(){//we can get the data by using method this is possible because of this two are in same class
        return bank_balance;
    }
    void setName(String name){//set the value of the private value 
        bank_name =name;
    }
    String getName(){
       return bank_name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Encap obj=new Encap();
        obj.setName("Union Bank");
        System.out.println("Bank Balance: "+ obj.getData());
        System.out.println("Get Bank Name: " +obj.getName());
        // obj.bank_balance; this way we can't call the encapsulated variables so we can crete methods and call it by using objects

    }
}

// output
// PS C:\REWORK\Java\OOPS Concept> javac Encapsulation.java
// PS C:\REWORK\Java\OOPS Concept> java Encapsulation      
// Bank Balance: 6500
// Get Bank Name: Union Bank
