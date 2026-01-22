package PATTERNS;
public class pattern8 {
    public static void main(String[] args) {
        int n=5;
        int r=1;
        int s=n;
        while (r<=n){
            int i=1;
            while (i<=s){
                if (r==i||r==n+1-i){
                    System.out.print(" * ");   
                } 
                else{
                    System.out.print("   ");
                }
                i++;
            }
            r++;
            System.out.println();
        }

    }    
}
