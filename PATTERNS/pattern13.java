package PATTERNS;
public class pattern13 {
    public static void main(String[] args) {
        
        int n=5;
        int r=1;
        int s=1;
     
        while (r<=n*2-1){
            int i=1;
            while (i<=s){
                System.out.print(" * ");
                i++;
            }
            if(r<n){
                s++;
            }
            else{
                s--;
            }
            r++;
            
            System.out.println();
        } 
    
    }
}

