public class MaxAvgOfSubArray {
    public static double findMaxAverage(int[] arr, int k) {
        double sum=0.0;
        double max;
        int i=0;
        for (i = 0; i < k; i++) {
            sum+=arr[i];
        }
        max=sum;
        for(int j=i;j<arr.length;j++){
            sum=sum-arr[j-i]+arr[j];
            if(sum>max){
                max=sum;
            }
        }
        return max/k;
    }
    public static void main(String[] args) {
        int[] arr={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAverage(arr,k));
    }
}