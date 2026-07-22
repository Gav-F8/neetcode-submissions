class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int leftProduct  = 1;
        int rightProduct = 1;

        for(int i = 0; i < len; i++){
            ans[i] = leftProduct;
            leftProduct *= nums[i];
        }

        for(int i = len - 1; i >= 0; i--){
            ans[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return ans;
    }
}  
