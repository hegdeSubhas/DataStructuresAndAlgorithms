import java.util.Arrays;
//with checking if the array is already sorted
public class BubbleSort {
    public static void main(String[] args) {
        //int[] arr={33,56,12,77,64,4,544};
        int[] arr1={1,2,3,4,5,6,7};
        Bubblesort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    public static void Bubblesort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean swapped=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
    }
}
