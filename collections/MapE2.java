package collections;

import java.util.HashMap;
import java.util.Map;

public class MapE2 {
    public static void main(String[] args) {

        int[] nums = {3,4,5,10,1,2};
        int sum = 13;
        //find two numbers whose sum is 9
        //n^2
        //map
        Map<Integer, Integer> result = new HashMap<>();

        for(int i = 0; i< nums.length; i++){
            //i = 3
            if(result.containsKey(nums[i])){
                int ifirst = result.get(nums[i]);
                System.out.println(" " + nums[ifirst]+ " " + nums[i] );
            }
            else{
                result.put(sum-nums[i], i);
            }
        }


//        for( int i = 0; i<nums.length-1; i++){
//            for (int j = i+1; j< nums.length; j++){
//                if( nums[i] + nums[j] == 9){
//                    System.out.println(" pair is " + nums[i] + " " + nums[j]);
//                    break;
//                }
//            }
//        }
    }
}
