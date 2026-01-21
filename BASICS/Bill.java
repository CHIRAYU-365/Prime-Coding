package BASICS;
import java.util.Scanner;

public class Bill {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Units:");
        int u = sc.nextInt();
        if (u>=100 && u<0){
            System.out.println("the total bill is :"+(u*2)+" Rs.");
        }
        else if (u>100 && u<=200){
            System.out.println("the total bill is :"+((u-100)*3+200)+" Rs.");
        }
        else if (u>200){
            System.out.println("the total bill is :"+((u-200)*5+500)+" Rs.");
        }

    }
}
