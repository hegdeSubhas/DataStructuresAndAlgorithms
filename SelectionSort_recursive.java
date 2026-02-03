public class SelectionSort_recursive {
    public  static void selectionSort(int[] array,int start){
        if(start>= array.length){
            return ;
        }
        int minIndex=start;
        for(int i=start+1;i<array.length;i++){
            if(array[i]<array[minIndex]){
                minIndex=i;
            }
        }
        int temp=array[minIndex];
        array[minIndex]=array[start];
        array[start]=temp;

        selectionSort(array,start+1);
    }

    public static void main(String[] args) {
        int[] arr={23,76,12,98,100,345,11};
        SelectionSort_recursive.selectionSort(arr,0);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
