public class linearSearchRecur {
    public static void main(String[] args) {
        int[] arr={2,3,5,3,6,9};
        System.out.println(LinearSearch(arr,5,0));
    }

    public static int LinearSearch(int[] arr ,int target,int start){
        if(start==arr.length){
            return -1;
        }
        if(arr[start]==target) return start;
        else return LinearSearch(arr,target,start+1);
    }
}
