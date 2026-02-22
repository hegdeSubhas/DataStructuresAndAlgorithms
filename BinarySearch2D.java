import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 5, 7},
                {10, 12, 15, 18},
                {20, 25, 30, 35}
        };
        System.out.println(Arrays.toString(BinarySearch(arr,1)));
    }

    public static int[] BinarySearch(int[][] arr,int target){
        int r=0;
        int c=arr.length-1;
        while(r<arr.length && c>=0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }else if(arr[r][c]<target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
