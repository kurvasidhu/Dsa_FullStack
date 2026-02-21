class Solution {
    public int countPrimeSetBits(int left, int right) {
        int[] a=new int[right+1];
        Arrays.fill(a,-1);
        a[0]=1;
        a[1]=1;
        for(int i=2;i<=(int)Math.sqrt(right);i++){
            if(a[i]==-1){
                for(int j=i*i;j<=right;j+=i){
                    a[j]=1;
                }
            }
        }
        int res=0,l=left;
        while(l<=right){
            int c=0;
            int n=l;
            while(n>0){
                c++;
                n=n&(n-1);
            }
            if(a[c]==-1){
                res++;
            }
            l++;
        }
        return res;
    }
}