import java.util.Scanner;

public class Conditional_Statements {
    public static void main(String[] args) {
        // Conditional Statements
        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter your age : ");
//        int age = scan.nextInt();
//
//        if (age >= 18){
//            System.out.println("You are eligible for National Identity card.");
//        }
//        else{
//            System.out.println("You are not eligible for National Identity card.");
//        }
//
//        System.out.print("Enter your weight : ");
//        int weight = scan.nextInt();
//
//        if(weight < 50){
//            System.out.println("You are UNDER WEIGHT.");
//        }
//        else if (weight >= 50 && weight < 100 ){
//            System.out.println("You are HEALTHY PERSON as long as weight is concerned.");
//        }
//        else {
//            System.out.println("You are OVER WEIGHT.");
//        }
//
//        // Switch Statement
//
//        switch (age){
//            case 12:
//                System.out.println("You are 12 years old.");
//                break;
//            case 56:
//                System.out.println("You are 56 years old.");
//                break;
//            default:
//                System.out.println("You didn't match any case.");
//                break;
//        }

        // Loops in Java are same as C++.
        //Three types of loop are there:
        /*
        1. while loop
        2. do-while loop
        3. for loop


        Moreover, "break" and "continue" in Java are same as C++.
         */

        /*
        Arrays in java are also same as in C++, but there is a slighter difference in syntax.
         */
        int [] arr = {1,2,3,4,5};
        // If you want to set size of array according to your self, then you can do it with 'new' keyword.
//        int arr1[] = new int[10];
//        int size = scan.nextInt();
//        System.out.println("Enter a size of array : ");
//        int arr2[] = new int[size];
//        for(int i =0 ;i < size; i++){
//            System.out.println("Now enter value for arr1 : ");
//            arr1[i] = scan.nextInt();
//            System.out.println("Now enter value for arr2 : ");
//            arr2[i] = scan.nextInt();
//        }
//        System.out.println("Values in Arr1 : ");
//        for(int ele:arr1){
//            System.out.print(ele + " ");
//        }
//        System.out.println("\nValues in Arr2 : ");
//        for(int ele:arr2){
//            System.out.print(ele + " ");
//        }
//
//        // Expressing For each loop.
//        for(int val:arr){
//            System.out.println(val);
//        }
        /*
        Similarly, we can work with Multi dimensional array.
         */

        // Exception Handling in Java using Try-Catch.

        try{
            System.out.println(arr[12]);
        }
        catch (Exception e){
            System.out.println("Some error occurred and the Error is : ");
            System.out.println("\"" + e + "\"");
        }
        System.out.println("Program Ended.");
    }

}
