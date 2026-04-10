import java.util.HashMap;
import java.util.Map;

class ContinousSubarraySum {
    public static boolean checkSubarraySum(int[] nums, int k) {


        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int prefixSum=0;

        for(int i=0;i<nums.length;i++){
           prefixSum=prefixSum+nums[i];
           int rem;
           if(k!=0){
            rem=prefixSum%k;
           }else{
            rem=prefixSum;
           }

           if(map.containsKey(rem)){
             if(i-map.get(rem)>=2){
                return true;
             }
           }
           else {
            map.put(rem,i);
           }


        }

        return false;
        
    }
}