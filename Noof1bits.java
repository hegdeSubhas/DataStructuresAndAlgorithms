public class Noof1bits {
    public static void main(String[] args) {
        System.out.println(noOf1Bits(11));
    }

    public static int noOf1Bits(int n){
        String number=Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}
