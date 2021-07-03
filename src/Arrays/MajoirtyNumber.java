package Arrays;

import java.util.HashMap;
import java.util.Map.Entry;

/*
 * Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-231 <= nums[i] <= 231 - 1
 */

public class MajoirtyNumber {
	public static void main(String[] args) {
		MajoritySolution sol = new MajoritySolution();
		int array[] = {2,2,1,1,1,2,3,2};
		System.out.println(sol.majorityElement(array));
		
	}
}
class MajoritySolution {
    public int majorityElement(int[] nums) {
    	HashMap<Integer,Integer> map = new HashMap<>();
    	for(int i:nums) {
    		if(map.containsKey(i)) {
    			int val = map.get(i)+1;
    			map.put(i, val);
    		}else {
    			map.put(i, 1);
    		}
    	}
    	
    	int max =Integer.MIN_VALUE;
    	int maxKey =0;
    	for(Entry<Integer, Integer> entry : map.entrySet()) {
    		
    		if(entry.getValue()>max) {
    			max=entry.getValue();
    			maxKey = entry.getKey();
    		}
    	}
    	return maxKey;
        
    }
}
