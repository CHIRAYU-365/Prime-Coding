
import java.util.Scanner;

public class lottery {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();
        

        if ( n>=300 && n<=460){
            System.out.println("You Won a Macbook!");
            if ( n>=300 && n<=380){
                System.out.println("Model: M1 Mac");
            }
            if ( n>=380 && n<=460){
                System.out.println("Model: M2 Mac");
            }
        }
        else if (n>=200 && n<=280){
            System.out.println("You won a Kurkure! ");
            if ( n>=200 && n<=240){
                System.out.println("Flavour: Chilli Flavour");
            }
            if ( n>240 && n<=280){
                System.out.println("Flavour: Onion Flavour");
            }
        }
        else if (n>=1100 && n<=1500){
            System.out.println("You won a cycle!");
            if ( n>=1100 && n<=1300){
                System.out.println("Brand: Avon Cycle");
            }
            if ( n>1300 && n<=1500){
                System.out.println("Brand: Hero Cycle");
            }
        }
        else if (n>50 && n<=80){
            System.out.println("You won a Bike!");
            if ( n>=50 && n<=65){
                System.out.println("Model: Bullet 350");
            }
            if ( n>65 && n<=80){
                System.out.println("Model: Bullet 650");
            }
        }
        else {
            System.out.println("Better Luck Next Time!");
        } 
    } 
    
}
