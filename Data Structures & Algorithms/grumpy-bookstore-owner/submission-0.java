class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int res = 0;
        int left = 0;
        
        int base = 0;
        int sum = 0;

        for(int i = 0; i < customers.length; i++){
            if(grumpy[i]==0){
                base+=customers[i];
            }
        }

        for(int right = 0; right < customers.length; right++){
            if(right-left+1 > minutes){
                if(grumpy[left] == 1) sum-=customers[left];
                left++;
            }
            if(grumpy[right]==1){
                sum+=customers[right];
            }
            res=Math.max(res, sum+base);
        }

        return res;
    }
}