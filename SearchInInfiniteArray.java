public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=10;
        System.out.println(answer(arr,target));
    }

    public static int answer(int[] arr,int target){
        int start=0;
        int end=1;
        while(arr[end]<target){
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return Search(arr,target,start,end);
    }

    public static int Search(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
