package SORTING;
public class selection_sort {
    public static void main(String[] args) {
        int[] arr ={7,2,4,8,1,5};
        selection(arr);
        for(int e:arr){
            System.out.print(e+" ");
        }
    }
    public static int[] selection(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int current =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[current]){
                    current=j;
                }
            }
            int temp =arr[i];
            arr[i]=arr[current];
            arr[current]=temp;
        }
        return arr;
    }
}
