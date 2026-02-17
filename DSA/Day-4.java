class Solution {
    public boolean isTrionic(int[] nums) {
        boolean f1=false,f2=false,f3=false;
        int i=0,i1=0,i2=0;
        while(i<nums.length && (i+1)<nums.length && nums[i]<nums[i+1]){
            f1=true;
            i++;
        }
        
        while(i<nums.length && (i+1)<nums.length && nums[i]>nums[i+1]){
            f2=true;
            i++;
        }
        
        while(i<nums.length && (i+1)<nums.length && nums[i]<nums[i+1]){
            f3=true;
            i++;
        }
        return f1 && f2 && f3 && i==nums.length-1;
    }
}