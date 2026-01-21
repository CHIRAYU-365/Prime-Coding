package PATTERNS;
public class pattern6 {
    public static void main(String[] args) {
        int n=5;
        int r=1;
        int s=5;
        int t=0;
        while (r<=n){
            int i=1;
            while (t<=r) { 
                System.out.print("   ");
                t++;
            }
            while (i<=s){
                System.out.print(" * ");
                i++;
            }
            r++;
            s++;
            
            
            System.out.println();
        } 
    }
}
