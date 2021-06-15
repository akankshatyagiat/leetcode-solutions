class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        // iif only array has elements
        // if(m==0 && n!=0){
        //     return medianSingleArray(nums2,n);
        // } // if m==0 and so so
        // else if(n==0 && m!=0){
        //     return medianSingleArray(nums1,m);
        // } // if n==0 and so so
        
        // if(m==1 && n==1)
        //     return (nums1[0]+nums2[0]) /2.0;
        int[] mergedArray=new int[(n+m)/2 +1];
        int index1=0,index2=0, index=0;
        while(index1<m && index2<n && index<mergedArray.length){
            if(nums1[index1]<=nums2[index2])
            {
                mergedArray[index]=nums1[index1];
                index1++;
            }
            else{
                mergedArray[index]=nums2[index2];
                index2++;
            }
            index++;
                
        } //while
        while(index1<m && index<mergedArray.length){
            mergedArray[index]=nums1[index1];
            index1++;
            index++;
        }
        while(index2<n && index<mergedArray.length){
            mergedArray[index]=nums2[index2];
            index2++;
            index++;
        }
        
        if((m+n)%2==1)
            return mergedArray[(m+n)/2];
        else
            return (mergedArray[((m+n)-1)/2]+mergedArray[(m+n)/2])/2d;
        
    }//function
    
    public double medianSingleArray(int[] arr,int size){
        if(size%2==1)
            return arr[size/2];
        return (arr[(size-1)/2]+arr[size/2])/2d;
    }
}