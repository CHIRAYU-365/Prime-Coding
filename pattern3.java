public class pattern3 {
    public static void main(String[] args) {
        int n=5;
        int r=1;
        int s=5;
        while (r<=n){
            int i=1;
            while (i<=s){
                System.out.print(" * ");
                i++;
            }
            r++;
            s--;
            System.out.println();
        } 
    }
}
