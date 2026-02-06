//917. Reverse Only Letters
public class ReverseLetters {
    public static String reverseletter(String s) {
        char[] arr =s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            while(i<j && ! Character.isLetter(arr[i])) i++;
            while(i<j && ! Character.isLetter(arr[j])) j--;
            char temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "ab-cd";
        System.out.println(ReverseLetters.reverseletter(s));
    }
}
