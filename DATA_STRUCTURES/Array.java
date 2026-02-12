package DATA_STRUCTURES;
public class Array {
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,8,3,5,0};
        int target =7;
        int ans = find(arr, target);
        System.out.print(ans);
    }
    public static int find(int[] arr,int target) {
        for(int i=0;i<arr.length;i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    
}
