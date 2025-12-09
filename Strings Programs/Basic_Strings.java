public class Basic_Strings {
    public static void main(String[] args) {//string is not a primitive data type it is a class in java.lang package
        String name= "Hey Hello";  //Direct Method without using new keyword
        String obj =new String("Hey name is new keyword");//using new keyword
        System.out.println(name);
        System.out.println(obj);
        String Name= """
                hey
                hello
                how
                are you
                """;// multi line String
                System.out.println(Name);
        }

}
