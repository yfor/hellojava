package hello;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    @Test
    public void run() {

        final Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        final int[] ints = solution.twoSum(nums, target);
        System.out.println(ints[0] + ":" + ints[1]);
    }

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> hash = new HashMap();
            int value;
            Integer preIndex;
            for (int i = 0; i < nums.length; i++) {
                value = nums[i];
                preIndex = hash.get(target - value);
                if (preIndex != null) {
                    return new int[]{preIndex, i};
                } else {
                    hash.put(value, i);
                }

            }
            return new int[]{0};
        }
    }
}
