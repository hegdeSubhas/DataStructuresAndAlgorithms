//344. Reverse String
import java.util.Arrays;
public class ReverseString {
        public static void reverseString(char[] s) {
            int n=s.length;
            int j=n-1;
            int i=0;
            while(i<j){
                char t=s[i];
                s[i]=s[j];
                s[j]=t;
                i++;j--;
            }
        }

    public static void main(String[] args) {
        char[] arr={'f','j','p','o'};
        ReverseString.reverseString(arr);
        System.out.println(Arrays.toString(arr));
    }
}

