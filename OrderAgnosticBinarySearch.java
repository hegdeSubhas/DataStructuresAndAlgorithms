public class OrderAgnosticBinarySearch {
    public static int OABinarySearch(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] < arr[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        } else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > target) {
                    start = mid + 1;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1={98,76,45,23,11,2};
        int[] arr2={23,49,67,98,123};
        System.out.println(OABinarySearch(arr1,2));
        System.out.println(OABinarySearch(arr2,123));
    }
}
