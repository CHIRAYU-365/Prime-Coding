package SORTING;
public class insertion_sort {
    public static void main(String[] args) {
        int[] arr ={7,2,4,8,1,5};
        insertion(arr);
        for(int e:arr){
            System.out.print(e+" ");
        }
    }
    public static int[] insertion(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int key =arr[i];
            int j= i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        return arr;
    }
}
