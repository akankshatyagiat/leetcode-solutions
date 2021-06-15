class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int number=nums[i];
            nums[i]=number*number;
            //System.out.println(nums[i]);
        }
        Arrays.sort(nums);
        return nums;
    }
}