class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int arr[]=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        double result=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;
                k++;
            }
            else{
                arr[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<m){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            arr[k]=nums2[j];
            j++;
            k++;
        }
        int len=arr.length;

        if(len%2==0){
            int  ans=arr[len/2-1]+arr[len/2];
            result=(double)ans/2;
        }
        else{
            double ans=(double)arr[len/2];
            result=ans;

        }
      return result;  
    }
}