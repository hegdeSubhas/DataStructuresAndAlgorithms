public class FibonacciFormula {
    public static void main(String[] args) {
        System.out.println(fibonacciFormula(8));
    }
    public static int fibonacciFormula(int n){
        return(int)(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
    }
}
//(1+sqrt(5)/2 )power n