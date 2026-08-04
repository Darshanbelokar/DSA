public class Max_wealth {
    public static void main(String[] args) {

    }
    public int maxWealth(int[][] accounts){
        //person=row
        //account=column
        int ans=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            int sum=0;
            for(int account=0;account<accounts[person].length;account++){
                sum+=accounts[person][account];
            }
                if(sum>ans){
                    ans=sum;
                }
        }
        return ans;
    }
}
