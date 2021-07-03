package Others;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = {3,3};
		
		Solution sol = new Solution();
		int[] res = sol.twoSum(nums, 6);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
    	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    	for(int i=0;i<nums.length;i++) {
    		map.put(nums[i],i);
    	}
    	for(int i=0;i<nums.length;i++) {
    		int k = target-nums[i];
    		if(map.containsKey(k) && map.get(k)!=i) {
    			return new int[] {i,map.get(k)};
    		}
    	}
		return nums;
        
    }
}
