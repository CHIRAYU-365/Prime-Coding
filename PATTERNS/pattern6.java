package PATTERNS;
public class pattern6 {
    public static void main(String[] args) {
        int n = 5;
        int i = 0; 

        while (i < n) {
            
            int j = 0;
            while (j < 2 * i) {
                System.out.print(" _ ");
                j++;
            }
            int k = 0;
            while (k < n - i) {
                System.out.print(" * ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}