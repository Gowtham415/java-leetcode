package Arrays;

import java.util.HashMap;
import java.util.Map;

/*
 * 	Given an array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.

Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

 

Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
 */
public class TwoSum2 {

	public static void main(String[] args) { 
		SolutionTwoSum2 sol = new SolutionTwoSum2();
		int[] nums = {2,3,4};
		int[] res = sol.twoSum(nums, 6);
		for(int i:res) {
			System.out.println(i);
		}

	}

}
class SolutionTwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
    	Map<Integer,Integer> map= new HashMap<Integer,Integer>();
    	for(int i=0;i<numbers.length;i++) {
    		map.put(numbers[i],i);
    	}
    	
    	for(int i=0;i<numbers.length;i++) {
    		int a = target-numbers[i];
    		if(map.containsKey(a) && i!=map.get(a)){
    			return new int[] {i+1,map.get(a)+1};
    		}
    	}
    	
    	return null;
    }
}