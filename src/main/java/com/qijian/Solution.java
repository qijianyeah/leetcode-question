package com.qijian;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {


        System.out.println(5/2);

        int[] nums = {2,7,11,15};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(nums,9)));

    }


}
