public class BitWiseOperation {
    public static void main(String[] args) {
        System.out.println(isOddEven(23));
    }
    public static boolean isOddEven(int n){
        return (n & 1) == 0;
    }
}
