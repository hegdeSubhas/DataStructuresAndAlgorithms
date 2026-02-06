//345. Reverse Vowels of a String
public class ReverseVowels {
    public static String reverseVowels(String s) {
        char[] arr =s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            while(i<j && ! isVowel(arr[i])) i++;
            while(i<j && ! isVowel(arr[j])) j--;
            char temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
        return new String(arr);
    }
    private static boolean isVowel(char c){
        c = Character.toLowerCase(c);
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(ReverseVowels.reverseVowels(s));

    }
}
