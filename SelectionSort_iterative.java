public class SelectionSort_iterative {
    public static void SelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    public static void main (String[]args){
        int[] array = {34, 2, 54, 6, 76, 12, 98, 1};
        SelectionSort_iterative.SelectionSort(array);
        for (int n : array) {
            System.out.print(n + " ");
        }
    }
}
