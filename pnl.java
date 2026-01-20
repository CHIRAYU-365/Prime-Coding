
import java.util.Scanner;

public class pnl {
    public static void main(String[] args) { 
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your CP:");
        int c = sc.nextInt();
        System.out.println("Enter your SP:");
        int s = sc.nextInt();
        int profit;
        int loss;
        if (s>c){
            System.out.println("you Made a Profit !! ");
            profit = s-c;
            System.out.println("Profit: "+profit);

        }
        else if (c>s){
            System.out.println("you Incurred a Loss !! ");
            loss = c-s;
            System.out.println("Loss: "+loss);
        }
        else{
            System.out.println("you are at Break-even !!! no profit no loss");
        }
    }   
}
