class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int ans=Integer.MAX_VALUE,ind=-1;
        for(int i=0;i<capacity.length;i++){
            if(capacity[i]>=itemSize){
                if(capacity[i]<ans){
                    ans=capacity[i];
                    ind=i;
                }
            }
        }
        return ind;
    }
}