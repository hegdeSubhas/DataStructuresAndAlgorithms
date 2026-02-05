//283. Move Zeroes
import java.util.Arrays;
public class MoveZero {
        public static void moveZeroes(int[] nums) {
            int index=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    nums[index]=nums[i];
                    index++;
                }
            }
            while(index<nums.length){
                nums[index]=0;
                index++;
            }
        }
    public static void main(String[] args) {
        int[] arr={1,0,12,0,3,0};
        MoveZero.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
