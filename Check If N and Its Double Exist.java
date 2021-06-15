class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> hashTable=new HashSet<>();
        boolean hasDouble=false, hasHalf=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                hasDouble=hashTable.contains(arr[i]*2);
            }//if
            else{
                hasDouble=hashTable.contains(arr[i]*2);
                hasHalf=hashTable.contains(arr[i]/2);
            }//else
            
            if(hasHalf || hasDouble)
                return true;
            hashTable.add(arr[i]);
        }// for
        return false;
    }//function
}