package BASIC_MATH;
import java.util.*;
public class factor {
    public static void main(String[] args) {
        int n = 100;
        List<Integer> s = new ArrayList<>();
        for(int i=2;i<=n;i++){
            while (n%i==0 && n>0){
                
                s.add(i);
                n=n / i ;
                }
        }
        Set<Integer> t = new HashSet<>(s);
        System.out.println(t);

    }
}
