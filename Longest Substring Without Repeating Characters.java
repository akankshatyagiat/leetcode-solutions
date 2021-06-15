class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        int ans=0,i,j;
        for(j=0,i=0;j<n;j++)
        {
            if(map.containsKey(s.charAt(j)))
                i=Math.max(i,map.get(s.charAt(j)));
            
            ans=Math.max(ans,j-i+1);
            map.put(s.charAt(j),j+1);
        }
        //System.out.println(i + " to " + j);
        return ans;
    }
}