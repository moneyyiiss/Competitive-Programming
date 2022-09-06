package August._16_Aug_2022;

class Solution {
    public int firstUniqChar(String s) {
        int[] fre = new int[26];
        int k=0;
        while(k<s.length()){
            char ch = s.charAt(k);
            fre[ch-'a']++;
            k++;
        }
        
        for(int i=0; i<s.length(); i++){
            char chh = s.charAt(i);
            if(fre[chh-'a'] == 1){
                return i;
            }
        }
        return -1;   
    }
}