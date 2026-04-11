import java.util.Stack;

public class MaxHeight {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        var n = heights.length;
        var maxArea = 0;
        for(int i=0;i<=n;i++){
           int crr = i!=n ? heights[i] : 0;
           while(!stack.isEmpty() && crr< heights[stack.peek()]){
               int ht = heights[stack.pop()];
               int left = stack.isEmpty()?-1:stack.peek();
               int right = i;
               maxArea = Math.max((right-left-1)*ht,maxArea);
           }

           stack.push(i);
        }

        return maxArea;
    }
}
