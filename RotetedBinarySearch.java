public class RotetedBinarySearch {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(search(arr,0));
    }

    public static int search(int[] arr, int target) {
        int Pivote=PivoteElement(arr);
        if(Pivote==-1){
            return BinarySearch(arr,target,0,arr.length-1);
        }
        if(arr[Pivote]==target){
            return Pivote;
        }
        if(target>=arr[0]){
            return  BinarySearch(arr,target,0,Pivote-1);
        }
        return  BinarySearch(arr,target,Pivote+1,arr.length-1);
    }

    public static int PivoteElement(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid]<=arr[start]){
                end= mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static int BinarySearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start=mid+1;}
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}

