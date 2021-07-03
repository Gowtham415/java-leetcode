package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
 * Given integer array nums, return the third maximum number in this array. 
 * If the third maximum does not exist, return the maximum number.
 * 
 * Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation: The third maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
Example 3:

Input: nums = [2,2,3,1]
Output: 1
Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum
 */
public class ThirdMaximumNumber {

	public static void main(String[] args) {
		SolutionThirdMax sol = new SolutionThirdMax();
		int[] nums = {1,1,2};
		System.out.println(sol.thirdMax(nums));
	}
	
}

class SolutionThirdMax {
    public int thirdMax(int[] nums) {
    	TreeSet<Integer> set = new TreeSet<Integer>();
    	for(int i:nums) {
    		set.add(i);
    	}
    	if(set.size()<3)
    		return set.last();
    	else {
    		return new LinkedList<Integer>(set).indexOf(set.size()-3);
    	}
    }
}
