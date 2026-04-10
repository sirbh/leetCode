import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1); // very important
        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            // step 1: update prefix sum
            prefixSum += num;

            // step 2: check if (prefixSum - k) exists
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            // step 3: store prefix sum in map
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}

