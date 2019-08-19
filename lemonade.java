import java.util.Scanner;

public class lemonade{

     public static void main(String []args){
        System.out.println("Hello. Please enter how many cups of lemonade you want.");
        Scanner scan = new Scanner (System.in);
        int cups = scan.nextInt();
        double price = 1.5;
        double total = cups * price;
        if(total<0){
            System.out.print("Sorry. Please Insert Positive Number");
        } else{
        System.out.printf("You owe me $%.2f",total);
        }
    }
}