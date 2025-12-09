public class String_Buffers {
    public static void main(String[] args) {
        StringBuffer name =new StringBuffer("Hello");
        System.out.println(name.capacity());// initial capacity is 16 is we add some any string like hello the length is 5 then it add 16+5 and now capacity will be 21
        System.out.println("----------------------------------------------");
        System.out.println("-------------Append Operations -------------------- ");
        name.append(" How are you");
        System.out.println("Append done: "+name);//append means adding some data to string
         System.out.println(name instanceof StringBuffer); //check is that name is string buffer or not 
        System.out.println("----------------------------------------------");
        System.out.println("-------------Convert String Buffer to String -------------------- ");
        StringBuffer name1 =new StringBuffer("Jacks");
        String str = name1.toString();
        System.out.println(str);
        System.out.println(str instanceof String);
        System.out.println("----------------------------------------------");
        System.out.println("-------------Insert Operations -------------------- ");
        name.insert(3, "java");//data inserted at index of 3
        System.out.println("Data inserted at index 3: "+  name);
        System.out.println("----------------------------------------------");
        System.out.println("-------------Replace Operations -------------------- ");
        name.replace(0, 3, "for");
        System.out.println("Replace Done:"+ name);//start from 0 and and end with 3 that place for is added
        System.out.println("----------------------------------------------");
        System.out.println("-------------Delete Operations -------------------- ");
        name.delete(0, 3);
        System.out.println("Delete Done:"+ name);// delete the string from 0 to 3 index value
        System.out.println("----------------------------------------------");
        System.out.println("-------------Reverse Operations -------------------- ");
        name.reverse();
        System.out.println("Reverse Done:" +name);
        System.out.println("----------------------------------------------");
        System.out.println("length of String buffer:"+ name.length());
        System.out.println("----------------------------------------------");
        System.out.println("Character at index value:"+name.charAt(5));
        System.out.println("----------------------------------------------");


    }
}
