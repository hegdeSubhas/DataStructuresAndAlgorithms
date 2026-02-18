public class AddStrings {
    public static String addStrings(String num1, String num2) {
        int n1=Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);
        int ans=n1+n2;
        return Integer.toString(ans);
    }

    public static void main(String[] args) {
        System.out.println(AddStrings.addStrings("11","4"));
    }
}
