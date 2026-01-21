
package PATTERNS;

public class pattern4 {
    public static void main(String[] args) {
        
        int n=5;
        int r=1;
        int s=1;
        int t=n-1;

        while (r<=n){
            int i=1;
            while (i<=t){
                System.out.print("   ");
                i++;
            }
            int j=1;
            while (j<=s){
                System.out.print(" * ");
                j++;
            }
            r++;
            s++;
            t--;
            System.out.println();
        } 
    
    }
}
