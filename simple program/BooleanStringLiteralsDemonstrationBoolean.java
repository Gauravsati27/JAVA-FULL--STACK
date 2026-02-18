/*
 Write a Java program to demonstrate the use of boolean and string literals.

The program must:
Declare a boolean literal representing a true value
Declare a boolean literal representing a false value
Declare a string literal representing a greeting message
Declare a string literal representing an empty string
Print each value with a descriptive message.
hints : 
use greeting : "Hello, Java!"
in empty string place you should print  double quotes[""]

[only description is given but you should print complete output]
output description should be as follows : 

Boolean Literal representing true: 
Boolean Literal representing false: 
String Literal (greeting): 
String Literal (empty string): 
 */
public class BooleanStringLiteralsDemonstrationBoolean {
  public static void main(String[] args) {
        // Write your code here
        boolean isJavaFun=true;
        boolean isFishFly=false;

        String gettingMessage="Hello, Java!";
        String emptyStr = "";
        //
        System.out.println("Boolean Literal representing true: "+isJavaFun);
        System.out.println("Boolean Literal representing false: "+isFishFly);
        System.out.println("String Literal (greeting): "+gettingMessage);
        System.out.println("String Literal (empty string): \"" + emptyStr + "\"");
    }
  
  
}
