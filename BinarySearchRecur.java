public class BinarySearchRecur {
    public static void main(String[] args) {
        int[] arr={1,23,45,67,89};
        System.out.println(Search(arr,67,0,arr.length));
    }
    public static int Search(int[] arr,int target,int s,int e){
        if(e<s)
            return -1;
        int m=s+(e-s)/2;
        if(arr[m]==target)
            return m;
        else if(target<arr[m])
            return Search(arr,target,s,m-1);
        else
            return Search(arr,target,m+1,e);
    }
}
