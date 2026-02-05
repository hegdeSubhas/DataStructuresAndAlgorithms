//136. Single Number
public class SingleNumber {
    public static int singleNumber(int[] nums){
      int res=0;
      for(int n : nums){
          res^=n;
      }

      return res;
    }
    public static void main(String[] args) {
        int[] nums ={4,5,4,1,5};
        int answer=SingleNumber.singleNumber(nums);
        System.out.println(answer);
    }
}
