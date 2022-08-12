import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Java!");

        // Variables:
        // Variables Name can start from $ or _ .
        // Java is case-sensitive language.

        int $a = 12;
        float b = 12f;
        String name = "Subhan";
        boolean isMan = true;
        System.out.println($a);
        System.out.println(name);
        System.out.println(b);
        System.out.println(isMan);
        /*
         Primitive Data types : byte (1 byte), char (2 byte), int (4 byte), float (4 byte), long (8 byte), double (8 byte)
         Non-Primitive Data types : Objects of classes that user create by himself.
         */

        // Operators in Java:
        // Operand - Operator - Operation
        /*
        Types of Operators in Java :
        Arithematic - Common Mathematical operations. + - * / % ++ --
        Assignment - = += -= *= /= %=
        Comparison - == != < > <= >=
        Logical - &&(and) ||(or) !(not)
         */
        System.out.println(45 % 78);
        // Taking input from user in java.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String input = scan.nextLine();
        System.out.println(input);
        
        // Conditional Statements in Java.
    }
}