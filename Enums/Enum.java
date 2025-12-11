enum Status {
    ACTIVE,
    INACTIVE,  // Constant are defined in the Uppercase in Enum 
    PENDING
}

public class Enum {
    public static void main(String[] args) {
        Status s = Status.PENDING;
        System.out.println(s);

        System.out.println(s.ordinal());   // ordinal is used to print the index of that Constant

        Status s1 [] = Status.values();  // values are used to print  constants in the Enum this must be array type
        System.out.println("Value at index 1 : " + s1[1]);

        System.out.println("----------------------------------");
        System.out.println("All Constants in Enum using the Values() method and loop:");
        for(Status ss: s1){
            System.out.println(ss);
        }
    }
}
