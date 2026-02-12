public class Array {
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,8,3,5,0};
        int target =5;
        System.out.println("the target is at indexes :");
        find(arr,target);
    }
    public static int find(int[] arr,int target) {
        for(int i=0;i<arr.length;i++){
            if (arr[i] == target){
                System.out.println(i);
            }
        }
        return -1;
    }
    
}
