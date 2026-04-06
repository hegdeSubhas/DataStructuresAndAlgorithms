public class BestTimeToBuySellStock {
    public static void main(String[] args) {
       int[] arr= {7, 1, 5, 3, 6, 4};
        System.out.println(buySell(arr));
    }

    public static int buySell(int[] prices){
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int price:prices){
            if(price<minPrice){
                minPrice=price;
            }else{
                int newProfit=price-minPrice;
                maxProfit=Math.max(newProfit,maxProfit);
            }
        }
        return maxProfit;
    }
}
