//704. Binary Search
public class BinarySearch {
    public static int search(int[] nums, int target) {
        int l=0;
        int n=nums.length;
        int h=n-1;
        while(l<=h){
            int mid= l+(h-l)/2;
            if(nums[mid]==target) return mid;
            else if(target<nums[mid]) h=mid-1;
            else l=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {-1,0,3,5,9,12};
        System.out.println(BinarySearch.search(a,9));
    }
}
