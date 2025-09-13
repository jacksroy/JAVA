class Datatypes{
    public static void main(String b[]){
        //Integer data types
        byte by = 12;  //Range: -128 to 127  1 Byte
        System.out.println("Byte value:"+by);
        short  s = 45;  //Range: -32,768 to 32,767  2 Bytes
        System.out.println("Short value:"+s);
        int i = 100; //Range: about -2 billion to +2 billion 4 Bytes
        System.out.println("Integer value:"+i);
        long l = 4656l;// very long 8 Bytes by default java consider int data types so we need to make it long we use l at last of assigning value like 5436l
        System.out.println("Long value:"+l);


        // Float values
        float flo=789.87f;  //Range: 7 decimal digits (approx). 4 Bytes java by default use Double so to use float we need to use f at last like 45.76f
        System.out.println("Float value:"+flo);
        double dou =345.987; //range is more than float
        System.out.println("Double value:"+dou);

        //character values
        char cl='b';//character is 2 byte of size can use single quotes for characters ''
        System.out.println("Character  value:"+cl);

        //booleans values
        boolean bo=true;  //unlike other lang we use only true and false java doe't sipport 0 & 1 instead of true and false
        System.out.println("Boolean value:"+bo);
        
    }

}

//output
// PS C:\REWORK\Java> javac Datatypes.java
// PS C:\REWORK\Java> java Datatypes
// Byte value:12
// Short value:45
// Integer value:100
// Long value:4656
// Float value:789.87
// Double value:345.987
// Character  value:b
// Boolean value:true
