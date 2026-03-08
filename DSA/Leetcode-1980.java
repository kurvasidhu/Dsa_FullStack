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



/*

You are given n unique binary strings, and each string has a length of n. The task is to return any binary string of length n that does not appear in the 
given array. For example, consider the input nums = ["01","10"]. Here the number of strings is 2, so n = 2. If we list all possible binary strings of length 2,
they are 00, 01, 10, and 11. However, the array contains only 01 and 10. This means the missing binary strings are 00 and 11. Since the problem allows returning
any missing string, either 00 or 11 would be a correct answer.

The important idea behind this problem is understanding how many binary strings are possible. For a binary string of length n, the total number of possible 
strings is 2ⁿ because each position can be either 0 or 1. However, the input array contains only n strings, which is much smaller than 2ⁿ when n > 1. 
For example, if n = 3, the total possible binary strings are 000, 001, 010, 011, 100, 101, 110, and 111, which is 8 strings in total. But the input 
array would contain only 3 strings. Therefore, it is guaranteed that some binary strings are missing, and we just need to find one of them.

A simple brute force approach can be used to solve this problem. First, store all the given binary strings in a HashSet so that we can check 
quickly whether a string already exists in the input. Next, generate all possible binary numbers from 0 to 2ⁿ − 1.
For each number, convert it into a binary string using Integer.toBinaryString(). Sometimes this conversion produces strings shorter 
than length n, so we add leading zeros until the length becomes n. After generating each binary string of the correct length, 
we check whether it exists in the HashSet. If the string is not present, that means it is missing from the input array, and
we can immediately return it as the answer.

For example, if the input is nums = ["01","10"], we first store the values in a set { "01", "10" }. Then we generate numbers from 0 to 3 (since 2² = 4). 
Converting these numbers to binary gives "0", "1", "10", and "11". After padding them to length 2, they become "00", "01", "10", and "11". We check each
string against the set. The first string "00" is not present in the set, so we return "00" as the result.

The time complexity of this brute force method is O(2ⁿ) because we potentially generate all binary strings of length n. Checking whether a string exists 
in the HashSet takes O(1) time. Although 2ⁿ might seem large, the constraint in this problem is n ≤ 16, so the maximum number of generated strings is 2¹⁶, 
which is manageable for a computer. Therefore, this brute force approach works within the problem constraints.

*/
