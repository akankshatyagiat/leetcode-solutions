class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else
                count=0;
            max=Math.max(count,max);
        }
        return max;
        
//         int count=0,max=0;
//         if(nums.length==1 && nums[0]==1)
//             return 1;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==1){//&& nums[i+1]==1){
//                 System.out.println("first condition: ");
//                 count+=1;
//             }
//             else if(nums[i]==1 && i+1==nums.length-1){
//                 System.out.println("seond condition: ");
//                 count+=1;
//             }
                    
//             else{
//                 count=0;
//                 System.out.println("third condition");
//             }
//             max=Math.max(count,max);
//         }
//         return max;
    }
}