public class ComplimentBinary {
    public static void main(String[] args) {
        System.out.println(complimentBinary(5));
    }
    public static int complimentBinary(int n){
        int bits=Integer.toBinaryString(n).length();
        int shift=(1>>bits)-1;
        return n^shift;
    }
}
