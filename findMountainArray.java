public class findMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(findInMountainArray(arr,target));
    }
    public static int findInMountainArray(int[] arr ,int target){
        int peak=peakIndexInMountainArray(arr);
        int first=BinarySearch(arr,target,0,peak);
        if(first!=-1){
            return first;
        }
        return BinarySearch(arr,target,peak,arr.length);
    }
    public static int peakIndexInMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start!=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;
    }

    public static int BinarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
