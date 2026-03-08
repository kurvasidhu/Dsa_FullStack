class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int[] a=new int[nums.length];
        int[] b=new int[nums.length+1];
        a[0]=nums[0];
        b[nums.length]=1;
        for(int i=1;i<nums.length;i++){
            a[i]=a[i-1]+nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            b[i]=b[i+1]*nums[i];
        }

        int ind=-1;
        for(int i=1;i<nums.length;i++){
            if(a[i-1]==b[i+1]){
                return i;
            }
        }
        return -1;
    }
}