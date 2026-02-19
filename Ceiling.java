public class Ceiling {
    public static int ceiling(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<high){
            mid=low+(high-low)/2;
            if(arr[mid]==target){
                return target;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return mid;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,9,14,16,18};
        System.out.println(ceiling(arr,15));
    }
}
