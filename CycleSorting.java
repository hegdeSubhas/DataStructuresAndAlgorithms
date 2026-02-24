import java.util.Arrays;

public class CycleSorting {
    public static void main(String[] args) {
    int[] arr={6,1,3,5,2,4,7};
    cycleSorting(arr);
    System.out.println(Arrays.toString(arr));
    }
    public static void cycleSorting(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]) {
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }
    }
}
