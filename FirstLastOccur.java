//34. Find First and Last Position of Element in Sorted Array
import java.util.Arrays;
public class FirstLastOccur{
    public int search1(int[] array,int target,int low,int high){
        int result=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(array[mid]==target){
                result=mid;
                high=mid-1;
            }else if(array[mid]<target){
                low = mid+1;
            }else if(array[mid]>target){
                high = mid-1;}
        }
        return result;
    }

    public int search2(int[] array,int target,int low,int high){
        int result=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(array[mid]==target){
                result = mid;
                low=mid+1;
            }else if(array[mid]<target){
                low = mid+1;
            }else if(array[mid]>target){
                high = mid-1;
            }
        }
        return result;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] answer={-1,-1};
        if(nums.length==0) return answer;

        int first =search1(nums,target,0,nums.length-1);
        if(first==-1) return answer;
        int second=search2(nums,target,first,nums.length-1);

        answer[0]=first;
        answer[1]=second;
        return answer;

    }

    public static void main(String[] args) {
        int[] array={5,7,7,8,8,10};
        FirstLastOccur flo=new FirstLastOccur();
        System.out.println(Arrays.toString(flo.searchRange(array,8)));
    }
}
