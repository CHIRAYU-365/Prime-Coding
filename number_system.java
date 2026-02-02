public class number_system{
    public static void main(String[] args) {
        int n= 39;
        int t = 0;
        int r =0;
        while (n>0){
            t += n%2;
            t*=10;
            n/=2;
        }
        while (t>0){
            
            r+=t%10;
            r*=10;
            t/=10;
        }
        System.out.println(r/10);
    }
}