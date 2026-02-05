import java.util.HashSet;
//217. Contains Duplicate
public class ContainsDuplicate  {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        for(int num:nums){
            if(!set.add(num)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array= {1,2,3,1};
        System.out.println(ContainsDuplicate.containsDuplicate(array));
    }
}
