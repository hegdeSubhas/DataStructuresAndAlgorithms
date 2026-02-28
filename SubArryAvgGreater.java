public class SubArryAvgGreater {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int count=0;
        int i=0;
        for (i = 0; i < k; i++) {
            sum+=arr[i];
        }
        int avg=sum/k;
        if(avg>=threshold){
            count++;
        }
        for(int j=i;j<arr.length;j++){
            sum=sum-arr[j-i]+arr[j];
            avg=sum/k;
            if(avg>=threshold){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
       int[] arr = {11,13,17,23,29,31,7,5,2,3};
        int k = 3;
        int threshold = 5;
        System.out.println(numOfSubarrays(arr,k,threshold));
    }
}