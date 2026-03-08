class Solution {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> set=new HashSet<>();
        for(String i:nums){
            set.add(i);
        }
        int n=16;
        String ans="";
        for(int i=0;i<=(1<<n);i++){
            String r=Integer.toBinaryString(i);
            while(nums[0].length()>r.length()){
                r="0"+r;
            }
            if(!set.contains(r)){
                ans=r;
                break;
            }
        }
        return ans;
    }

}