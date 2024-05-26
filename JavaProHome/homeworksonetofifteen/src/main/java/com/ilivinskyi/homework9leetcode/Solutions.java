package homework9leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solutions {

    public boolean containsDuplicate(int[] nums) {
        var set = new HashSet<Integer>();
        for (int item : nums) {
            if (!set.add(item)) {
                return true;
            }
        }
        return false;
    }

    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return false;
        }
        var inputString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        var reversedString = new StringBuilder(inputString).reverse().toString();
        return inputString.equals(reversedString);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        // we need to return something,
        // the task guarantee us that there will be a solution always
        return new int[]{-1, -1};
    }
}
