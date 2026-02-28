import java.util.HashSet;
import java.util.Set;

public class ConatinsDuplicate_II {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,1};
        int k1=3;
        System.out.println(containsNearbyDuplicate(arr1,k1));
        int[] arr2={1,2,3,1,2,3};
        int k2=2;
        System.out.println(containsNearbyDuplicate(arr2,k2));
    }
}