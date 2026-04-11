import java.util.Arrays;
import java.util.Stack;

public class NextGreaterEleentII {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int arrlen = nums.length;
        int[] ans = new int[arrlen];
        Arrays.fill(ans,-1);

        for(int i=0;i<(2*arrlen)-1;i++){
           int curr = nums[i%arrlen];
           while(!stack.isEmpty() && curr>nums[stack.peek()]){
                 ans[stack.pop()]=curr;
           }

           if(i<arrlen){
            stack.push(i);
           }
        }

        return ans;
    }
}
