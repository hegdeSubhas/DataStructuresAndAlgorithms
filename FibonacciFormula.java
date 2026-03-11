public class FibonacciFormula {
    public static void main(String[] args) {
        System.out.println(fibonacciFormula(50));
    }
    public static long fibonacciFormula(int n){
        return(long)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
}
//(1+sqrt(5)/2 )power n