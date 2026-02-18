public class LinearSearch {
    public  static int linearSearch(int[] arr,int target){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==target) return i;
        }
        return -1;
    }

    public static int StringLinearSearch(String str,char target){
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
    // int[] array={1,2,34,5,43,98};
     String str="Subhas Hegde";
     //System.out.println(linearSearch(array,15));
        System.out.println(StringLinearSearch(str,'b'));
    }
}
