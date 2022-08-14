import java.util.Scanner;

public class Conditional_Statements {
    public static void main(String[] args) {
        // Conditional Statements
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = scan.nextInt();

        if (age >= 18){
            System.out.println("You are eligible for National Identity card.");
        }
        else{
            System.out.println("You are not eligible for National Identity card.");
        }

        System.out.print("Enter your weight : ");
        int weight = scan.nextInt();

        if(weight < 50){
            System.out.println("You are UNDER WEIGHT.");
        }
        else if (weight >= 50 && weight < 100 ){
            System.out.println("You are HEALTHY PERSON as long as weight is concerned.");
        }
        else {
            System.out.println("You are OVER WEIGHT.");
        }
    }

}
