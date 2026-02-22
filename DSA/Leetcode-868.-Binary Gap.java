class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int c=0,max=0;
        boolean f=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                if(f){
                    f=false;
                    max=Math.max(max,c);
                    c=0;
                }
                c++;
                f=true;
            }
            else{
                c++;
            }
        }
        return max;
    }
}