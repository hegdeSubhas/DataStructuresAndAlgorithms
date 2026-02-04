//67. Add Binary
public class AddBinary {
    public static String addBinary(String a, String b) {
        StringBuilder sb =new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry>0){
            int sum=carry;
            if(i>=0) sum+=a.charAt(i)-'0';
            i--;
            if(j>=0) sum+=b.charAt(j)-'0';
            j--;
            sb.append(sum%2);
            carry=sum/2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str1 = "11";
        String str2 = "1";
        String answer = AddBinary.addBinary(str1,str2);
        System.out.println(answer);
    }
}