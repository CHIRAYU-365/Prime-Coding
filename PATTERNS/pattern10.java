package PATTERNS;
public class pattern10 {
    public static void main(String[] args) {
        int n=5;
        int r=1;
        int s=n*2-1;
        int t=0;
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
            s-=2;
            t++;
            System.out.println();
        } 
    
    }
}