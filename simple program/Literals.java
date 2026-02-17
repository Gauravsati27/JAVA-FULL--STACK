
/*Write a Java program to demonstrate the use of different types of literals in Java.
The program must:
Declare an integer literal representing a decimal value
Declare an integer literal representing an octal value
Declare an integer literal representing a hexadecimal value
Declare a floating-point literal of type double
Declare a floating-point literal of type float
Declare a character literal
Print each value with a descriptive message. */
public class Literals {
    public static void main(String[] args) {
        int decimalVal=200;
        int octalVal=020;
        int hexVal=0xAB;
        double doubleVal = 1.2345;
        float floatVal   = 7.25f;
        char charVal = 'K';
        System.out.println("Decimal: " + decimalVal);
        System.out.println("Octal: " + octalVal);
        System.out.println("Hex: " + hexVal);
        System.out.println("Double: " + doubleVal);
        System.out.println("Float: " + floatVal);
        System.out.println("Char: " + charVal);

    }
}

