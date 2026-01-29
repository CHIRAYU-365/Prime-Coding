public class gcd {
    public static void main(String[] args) {
        int a=104;
        int b=840;
        int d=0;
        if (a>b){
            for(int i=1;i<=(b);i++){
                if(a%i==0 && b%i==0){
                    d=i;
                    continue;
                }
                else{
                    continue;
                }
            }
            System.out.println(d);
        }
        else{
            for(int i=1;i<=(a);i++){
                if(a%i==0&&b%i==0){
                    d=i;
                    continue;
                }
                else{
                    continue;
                }
            }
            System.out.println(d);
        }
    }
}
