/*
Suppose you are given an array of positive integers. Write an algorithm to find the maximum sum subarray such that no two elements are adjacent to each other in the input array.
*/
public int maxsumNonContiguous(int[] array){
     /* Empty array */
     if(array == null)
        return 0;
        
     int arrayLength = array.length;
     /* Current maximum sum including the current value */
     int sum1 = array[0];
     /* Current maximum sum excluding the current value */
     int sum2 = 0;
     
     /* Iterate through the array from second element to the end */
     for(int i = 1; i  <  arrayLength; i++){
     
         /* Current maximum sum excluding the current index value */
         sum3 = Math.max(sum1,sum2);
         
         /* Move the value of sum3 into sum2 */
         sum2 = sum3;

         /* Current maximum sum including the current index value */
         sum1 = sum2 + array[i];
     }
     
     /* Return the maximum of sum1 and sum2 */
     return Math.max(sum1, sum2);
 }