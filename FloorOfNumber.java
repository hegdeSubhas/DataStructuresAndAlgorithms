public class FloorOfNumber {
    public static int Floor(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==target){
                return target;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return high;
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        System.out.println(Floor(arr,15));
    }
}