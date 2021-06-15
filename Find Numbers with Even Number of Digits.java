class Solution {
    public int findNumbers(int[] nums) {
        int totalNumbersWithEvenLength=0;
        for(int num:nums){
            int numberOfDigits=calculateDigits(num);
            if(numberOfDigits%2==0)
                totalNumbersWithEvenLength++;
        }
        return totalNumbersWithEvenLength;
    }// findNumbers
    
    public int calculateDigits(int number){
        int length=0;
        while(number>0){
            length++;
            number/=10;
        } //while
        return length;
    }//calculate
}