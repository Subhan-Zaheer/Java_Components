import java.util.Scanner;
public class stars_Printing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = scan.nextInt();
        System.out.println("");
        int columns = rows;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns;j++){
                if(j<i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
