public class RichestCustomer {
    public static int maximumWealth(int[][] accounts) {
        int[] arr=new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            for(int j:accounts[i]){
                arr[i]+=j;
            }
        }
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1,4}};
        System.out.println(maximumWealth(accounts));
    }
}
