class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int length=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<length;i++)
        {
            int diff=target-nums[i];
            if(map.containsKey(diff))
            {
                return new int[] {map.get(diff),i };
            }
            map.put(nums[i],i);
        }//for
        return new int[] {-1,-1};
    }// method

} //class