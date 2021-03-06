package Arrays;

/*
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
 */

public class MoveSZeros {
	
	public static void main(String[] args) {
		MoveZerosSolution sol = new MoveZerosSolution();
		int[] array= {0,1,0,3,12}; 
		sol.moveZeroes(array);
	}

}

class MoveZerosSolution {
    public void moveZeroes(int[] nums) {
    	int index = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
        
        for(int i=index;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
