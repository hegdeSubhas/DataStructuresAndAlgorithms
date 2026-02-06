//268 Missing Number
public class MissingNumber {
    public static int  Missing(int[] nums){
        int sum=0;
        int asum=0;
        for (int num : nums) {
            sum += num;
        }
        for(int i=0;i<nums.length;i++){
            asum+=i;
        }
        return sum-asum;
    }

    public static void main(String[] args) {
        int[] arr ={0,1,2,4};
        int ans = MissingNumber.Missing(arr);
        System.out.println(ans);
    }
}
