class Solution {
    public int maxProduct(int[] nums) {
        int result=nums[0];
      int max=nums[0];
      int min=nums[0];
      for(int i=1;i<nums.length;i++){
        int curr=nums[i];
        int tempmax=Math.max(curr,Math.max(curr*min,curr*max));
        min=Math.min(curr,Math.min(curr*min,curr*max));
        max=tempmax;
        result=Math.max(max,result);
      }
      return result;
    }
}