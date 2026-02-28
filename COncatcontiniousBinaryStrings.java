public class COncatcontiniousBinaryStrings {
    public static int concatenatedBinary(int n) {
        long result = 0;
        int mod = 1000000007;
        int length = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) {
                length++;
            }
            result = ((result << length) + i) % mod;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(concatenatedBinary(3));
    }
}
