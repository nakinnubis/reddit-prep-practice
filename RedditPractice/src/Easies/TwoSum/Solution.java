package Easies.TwoSum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Solution {
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    public static int[] twoSum(int[] nums, int target) {       if (nums == null || nums.length == 0) {
        return nums;
    }
        int current  =0,length = nums.length;
        int kk =1;
        while (current < length) {
//            int l = 1+current;
            kk = kk+current;
            int i = nums[kk];
            var _sum = nums[current] +i;
            if(target==_sum){
                return new int [] {current,kk};
            }
            current++;
        }
        return nums;
    }

    public static void main(String[] args) {
        var test = twoSum(new int[]{3,2,4},6);
        System.out.println(test);
    }
}
