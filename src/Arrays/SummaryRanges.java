package Arrays;

import java.util.ArrayList;
import java.util.List;

/*
 * You are given a sorted unique integer array nums.

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b
 

Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
Example 2:

Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"
Example 3:

Input: nums = []
Output: []
Example 4:

Input: nums = [-1]
Output: ["-1"]
Example 5:

Input: nums = [0]
Output: ["0"]
 */

public class SummaryRanges {
	public static void main(String[] args) {
		
		Solution12 sol = new Solution12();
		int[] nums = {0,2,3,4,6,8,9};
		sol.summaryRanges(nums).forEach(System.out::println);
		
	}
}

class Solution12 {
    public List<String> summaryRanges(int[] nums) {
    	List<String> list = new ArrayList<String>();
    	if(nums.length==0) {
    		return list;
    	}
		int start =nums[0];
		int end =nums[0];
    	for(int i=1;i<nums.length;i++) {
    		if(nums[i]==(nums[i-1]+1)) {
    			if(nums[i]!=nums[nums.length-1]) {
    				continue;
    			}else {
    				end = nums[i];
    			}
    			
    		}else {
    			end = nums[i-1];
    			if(start==end) {
    				list.add(String.valueOf(start));
    			}else {
    				list.add(String.valueOf(start)+"->"+String.valueOf(end));
    			}
    			start = nums[i];
    		}
    	}
    	if(start<end){
			list.add(start+"->"+end);
		}else{
				list.add(start+"");
		}
    	
    	return list;
    	
    }
}
	