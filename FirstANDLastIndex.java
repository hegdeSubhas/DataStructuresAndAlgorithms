import java.util.Arrays;

public class FirstANDLastIndex{
    public static int[] searchRange(int[] nums, int target) {
        int first=search(nums,target,true);
        int last=search(nums,target,false);
        return new int[]{first,last};
    }
    public static int search(int[] nums,int target,boolean FirstOrLast){
        int answer=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                answer=mid;
                if(FirstOrLast){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums,8)));
    }
}