
package DATA_STRUCTURES;
public class max_arr {
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,8,3,5,0};
        System.out.print(MAX(arr));
    }
    public static int MAX(int[] arr) {
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
        
    }
}
