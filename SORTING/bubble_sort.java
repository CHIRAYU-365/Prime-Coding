package SORTING;
import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr ={2,4,5,6,3,1,0};
        bubble(arr); 
        for(int ele:arr){
            System.out.print(ele+" ");
        }   
    }
    public static int[] bubble(int[] arr) {
        int n = arr.length ;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        // System.out.print(Arrays.toString(arr));
        return arr ;
    }
}