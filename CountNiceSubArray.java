import java.util.HashMap;
import java.util.Map;

class Solution {
   public int numberOfSubarrays(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1); // base case

    int prefixSum = 0;
    int count = 0;

    for (int num : nums) {
        // convert to 0/1
        if (num % 2 == 1) {
            prefixSum++;
        }

        // check if (prefixSum - k) exists
        if (map.containsKey(prefixSum - k)) {
            count += map.get(prefixSum - k);
        }

        // store current prefixSum
        map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
    }

    return count;
}
}