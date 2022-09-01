package Daily_10Question.Sep.1_sep;
//Leetcode question 1004
class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int ei = 0;
        int si = 0;
        int count = 0;
        int len =0;
        while(ei < n){
            if(nums[ei++] == 0) count++;
            // System.out.println(count + "---");
            
            while(count == k+1){
                if(nums[si++] == 0) count--;
            }
            len = Math.max(len, ei-si);
            // System.out.println(ei + "=====");
            // System.out.println(si + "////");
            // System.out.println(len + "......");
        }
        return len;
    }
}