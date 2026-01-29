public class gcd_while {
    public static void main(String[] args) {
        int d1 =36 ;
        int d2 =60;
        int r;
        while(d1%d2!=0){
            r=d1%d2;
            d1=d2;
            d2=r;
        }
        System.out.println(d2);
    }
}
