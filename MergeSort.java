import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,3,8,1,3,9};
        mergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr,int left,int right){
        if(left>=right) return;;
            int mid=left+(right-left)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);

    }
    public static int[] merge(int[] arr,int left,int mid,int right){
            int k=0;
            int[] temp=new int[right - left + 1];
            int i=left;
            int j=mid+1;
            while(i<=mid && j<=right){
                if(arr[i]<=arr[j]){
                    temp[k]=arr[i];
                    k++;
                    i++;
                }
              else{
                    temp[k]=arr[j];
                    k++;
                    j++;
                }
            }
        while(i<=mid){
            temp[k]=arr[i];
            k++;
            i++;
            }
        while(j<=right){
            temp[k]=arr[j];
            k++;
            j++;
        }
        System.arraycopy(temp, 0, arr, left, temp.length);
            return temp;
    }
}
