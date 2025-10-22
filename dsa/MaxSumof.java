package dsa;

import java.util.List;

public class MaxSumof {
    public static void main(String[] args) {

        List<Integer> nums = List.of(3,4,1,5,6,7,3,9,1);
        int k = 3;
        int cSum = nums.get(0) + nums.get(1) + nums.get(2);
        int maxSum=0;
        int i = 0;
        int j = k;

        while (j< nums.size()){
            cSum = cSum-nums.get(i)+nums.get(j);
            maxSum = cSum > maxSum? cSum: maxSum;
            i++;
            j++;
        }
        System.out.println("max sum is " + maxSum);
    }
}
