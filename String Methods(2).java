public class String_Methods {
    public static void main(String[] args) {
        String name = "Hello ";
        String Name = "hello";
        System.out.println("String length:" + name.length());// we will get length of String
        System.out.println("----------------------------------------------------------------");
        System.out.println("Character index in string:" + Name.charAt(1));// used to find the index of 1 in String in
                                                                          // NAme variable
        System.out.println("----------------------------------------------------------------");
        System.out.println("checks 2 strings are equal or not:" + name.equals(Name));// checks string 1 and string 2 are
                                                                                     // equal or not
        System.out.println("----------------------------------------------------------------");
        System.out.println("checks 2 string ignore case sensitive:" + name.equalsIgnoreCase(Name));// check 2 strings
                                                                                                   // and ignore case
                                                                                                   // sensitive
        System.out.println("----------------------------------------------------------------");
        System.out.println("String's compare:" + name.compareTo(Name));// 0 → both strings are equal ,<0 → current
                                                                       // string is smaller, >0 → current string is
                                                                       // greater ,Case-sensitive ("apple" > "Apple").
        System.out.println("----------------------------------------------------------------");
        System.out.println("Begin and end index of string:" + name.substring(0, 3));// here 0 is starting index and 3 is
                                                                                    // ending index
                                                                                    // System.out.println("Begin index
                                                                                    // of string:"+name.substring(0));
                                                                                    // also can do
        System.out.println("----------------------------------------------------------------");
        System.out.println("find index of character and string also: " + name.indexOf("e")
                + "  | index value of String:" + Name.indexOf("llo"));// find index value of e in name
        System.out.println("----------------------------------------------------------------");
        System.out.println("String to upper case:" + name.toUpperCase());// convert string to upper case
        System.out.println("----------------------------------------------------------------");
        System.out.println("String to Lower case:" + name.toLowerCase());// convert Name to lowerCase
        System.out.println("----------------------------------------------------------------");
        System.out.println(
                "String Trim used to remove leading and trail spaces of string is no spaces then return string:"
                        + Name.trim());
        System.out.println("----------------------------------------------------------------");
        System.out.println("Replace the character:" + name.replace('e', 'E'));// here old character 'e' is replace with
                                                                              // 'E' and we can also do with word also
        System.out.println("Replace the word:" + name.replace("lo", "LO"));
        System.out.println("----------------------------------------------------------------");
        String Sentence = "Hey ,How ,are ,you ,are ,you ,good";
        String[] words = Sentence.split(" ,");// split with one space and comma
        for (String i : words) {
            System.out.println("Split by one space and comma like split in python:" + i);
        }
        // System.out.println("Split by one space and comma:"+Sentence.split(" ,"));
        System.out.println("----------------------------------------------------------------");
        String result = String.join("-", "2025", "10", "07");
        System.out.println(result);// hey here - is added to each element
        System.out.println("----------------------------------------------------------------");
        System.out.println("Check string value start from this string or not:" + name.startsWith("Hel"));
        System.out.println("----------------------------------------------------------------");
        System.out.println("Check String value ends with this string or not:" + name.endsWith("llo"));
        System.out.println("----------------------------------------------------------------");
        System.out.println("contains used to check is that word is present or not:" + name.contains("Hel"));
        System.out.println("----------------------------------------------------------------");
        System.out.println("Check String is Empty or not:" + name.isEmpty());
        System.out.println("----------------------------------------------------------------");
        System.out.println("Print String to Char Array");
        String s = "Java";
        char[] ch = s.toCharArray();//this method is used to convert string to characters

        for (char c : ch) {
            System.out.println(c);
        }
        System.out.println("----------------------------------------------------------------");
        int data=10;
        String convert=String.valueOf(data);
        System.out.println("Convert any data type variable into string :"+convert);
        System.out.println(convert instanceof String); //here we can check is that value 10 is string or not using instanceOf convert is variable name and instanceof is operator in java and String is data type


    }
}


// output
// PS C:\REWORK\Java\Strings Programs> javac String_Methods.java
// PS C:\REWORK\Java\Strings Programs> java String_Methods
// String length:6
// ----------------------------------------------------------------
// Character index in string:e
// ----------------------------------------------------------------
// checks 2 strings are equal or not:false
// ----------------------------------------------------------------
// checks 2 string ignore case sensitive:false
// ----------------------------------------------------------------
// String's compare:-32
// ----------------------------------------------------------------
// Begin and end index of string:Hel
// ----------------------------------------------------------------
// find index of character and string also: 1  | index value of String:2
// ----------------------------------------------------------------
// String to upper case:HELLO
// ----------------------------------------------------------------
// String to Lower case:hello
// ----------------------------------------------------------------
// String Trim used to remove leading and trail spaces of string is no spaces then return string:hello
// ----------------------------------------------------------------
// Replace the character:HEllo
// Replace the word:HelLO
// ----------------------------------------------------------------
// Split by one space and comma like split in python:Hey
// Split by one space and comma like split in python:How
// Split by one space and comma like split in python:are
// Split by one space and comma like split in python:you
// Split by one space and comma like split in python:are
// Split by one space and comma like split in python:you
// Split by one space and comma like split in python:good
// ----------------------------------------------------------------
// 2025-10-07
// ----------------------------------------------------------------
// Check string value start from this string or not:true
// ----------------------------------------------------------------
// Check String value ends with this string or not:false
// ----------------------------------------------------------------
// contains used to check is that word is present or not:true
// ----------------------------------------------------------------
// Check String is Empty or not:false
// ----------------------------------------------------------------
// Print String to Char Array
// J
// a
// v
// a
// ----------------------------------------------------------------
// Convert any data type variable into string :10
// true
