class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int left=0;
        int sum=0;
        int right=0;
        int result=Integer.MAX_VALUE;
        for(right=0;right<arr.length;right++){
             sum+=arr[right];
            while(sum>=target){
                result=Math.min(result,right-left+1);
                sum-=arr[left++];
            }
        }
        return result==Integer.MAX_VALUE?0:result;
        
    }
}