//58. Length of Last Word
public class LenOfLastWord {
    public static int LengthOfLastWord(String s){
        int len=0;
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        while(i>=0 && s.charAt(i)!=' '){
            len++;
            i--;
        }
        return len;
    }

    public static void main(String[] args) {
        String str= " Hello World      ";
        System.out.println(LenOfLastWord.LengthOfLastWord(str));
    }
}
