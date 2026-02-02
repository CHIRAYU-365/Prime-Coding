package NUMBER_SYSTEM;
import java.util.*;
public class bin_to_dec {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.print("binary :");
        int n = c.nextInt();
        
        int sum =0;
        int m=1;
        while (n>0){
            int r=n%10;
            sum = sum+r*m;
            n/=10;
            m*=2;
            
        }
        System.out.println("decimal :"+sum);
    }
}
