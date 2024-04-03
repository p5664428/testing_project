/* Summ functionality */
import java.util.Arrays;

public class TwoSumCal {

     public static void main(String []args){
         int[] reqSum = calTargetSum(new int[] {2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(reqSum));
     }
     
     public static int[] calTargetSum(int[] arr, int target) {
         int i = 0;
         int j = arr.length - 1;
         
         while (i < j) {
             int min = arr[i];
             int max = arr[j];
             int sum = min + max;
             
             if(sum == target) {
                 return new int[] {i + 1, j + 1};
             } else {
                 if(sum > target) {
                     j--;
                 } else {
                     i++;
                 }
             }
         }
          return new int[] {-1, -1};
     }
}
