import java.util.ArrayList;

public class LinearSearchList {
    public static void main(String[] args) {
        int[] arr={2,5,7,3,8,7};
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println(LinearSearch(arr,7,0,list));
    }
    public static ArrayList<Integer> LinearSearch(int[] arr,int target,int start,ArrayList<Integer> arrayList){
        if(start==arr.length){
            return arrayList;
        }
        if(arr[start]==target){
            arrayList.add(start);
        }
        return LinearSearch(arr,target,start+1,arrayList);
    }
}
