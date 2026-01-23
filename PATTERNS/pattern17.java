package PATTERNS;
public class pattern17 {
    public static void main(String[] args) {
        int n=5;
        int r=1;
        int s=n-2;
        int t=1;
        while(r<=n*2-3){
            int i=1;
            while(i<=s){
                System.out.print(" * ");
                i++;
            }
            int j=1;
            while (j<=t) {
                System.out.print("   ");
                j++;
            }
            int k=1;
            while(k<=s){
                System.out.print(" * ");
                k++;
            }
            if(r<n-1){
                    t+=2;
                    s--;
                }
            else{
                    t-=2;
                    s++;
            }
            r++;
            System.out.println();
        }
    }
}
