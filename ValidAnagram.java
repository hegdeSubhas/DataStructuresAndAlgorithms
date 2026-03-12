import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String str1="anagram";
        String str2="nagaram";
        System.out.println(isAnangram(str1,str2));
    }
    public static boolean isAnangram(String a,String b){
        char[] str1=a.toCharArray();
        char[] str2=b.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}
