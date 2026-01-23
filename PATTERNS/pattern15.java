package PATTERNS;
public class pattern15 {
     public static void main(String[] args) {
        int n = 5;
        int r = 1; 
        int s = 1;
        int t = 0;

        while (r<=n*2-1){
            int i=1;
            while (i<=s){
                System.out.print(" _ ");
                i++;
            }
            int j=1;
            while (j<=t){
                System.out.print(" * ");
                j++;
            }
            if(r<n){
                s++;
                t-=2;
            }
            else{
                s--;
                t+=2;
            }
            r++;
            System.out.println();
        } 
    }
}
