class Literals{
    public static void main(String args[]){
        //Integers Literals
        int decimal=10;
        System.out.println("Decimal :"+decimal);
        int octal=07;//ocatl start with zero 0
        System.out.println("octal :"+octal);
        int hex=0xA;// here 'x' represnt to hexa decimal value and start with 0x
        System.out.println(" Hexa Decimal :"+hex);
        int binary=0b100;  // herte 'b ' represent the binary value and start with 0b
        System.out.println("Binary :"+binary);


        //floating values 
        float fl=123.87f;// here 'f or F' make this values as float value
        System.out.println("float :"+fl); 
        double db=23.87d; //here we use 'd or D' to make this double but by default java take it as double values so just we can mentioned to float is enough
        System.out.println("Double :"+db);
        
        
        //character values
        char c='$';//we can take any value in this it assume as character it may be digits ,special characters ,alphabets 
        System.out.println("Character :"+c);


        //Boolean values
        boolean b=false;//by default it is false here literal is false
        System.out.println("Boolean :"+b);

    }
}