public class nosys {
    public static void main(String[] args) {
        int n=5;
        int m=1;
        int sum =0;
        while (n>0){
            int r=n%2;
            sum = sum+r*m;
            n/=2;
            m*=10;
        }
        System.out.println(sum);
    }
}
