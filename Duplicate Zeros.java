class Solution {
    public void duplicateZeros(int[] arr) {
        int numberOfZeros = 0;
        int length = arr.length - 1;
        
        for (int left = 0; left <= length - numberOfZeros; left++) {

            // Count the zeros
            if (arr[left] == 0) {

                // Edge case 
                if (left == length - numberOfZeros) {
                    // For this zero we just copy it without duplication.
                    arr[length] = 0;
                    length -= 1;
                    break;
                }
                numberOfZeros++;
            }
        }

        //System.out.println("no.s "+(length-numberOfZeros));
        // Start backwards from the last element which would be part of new array.
        int last = length - numberOfZeros;

        // Copy zero twice, and non zero once.
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + numberOfZeros] = 0;
                numberOfZeros--;
                arr[i + numberOfZeros] = 0;
            } else {
                arr[i + numberOfZeros] = arr[i];
            }
        }
    }//function
}