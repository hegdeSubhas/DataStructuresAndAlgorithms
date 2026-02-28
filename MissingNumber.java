import java.util.Arrays;

//268 Missing Number
public class MissingNumber {
    public static int cycleSorting(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correctIndex]) {
                int temp = arr[correctIndex];
                arr[correctIndex] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;
    }

    public static void main(String[] args) {
        int[] arr ={0,1,2,4};
        System.out.println(cycleSorting(arr));
    }
}
