package Others;

public class SumExcludingASeries {
	public static void main(String[] args) {
		int[] nums = {6,3,4,8,9,2,1,6,4};
		System.out.println(sumOfSeries(nums));
	}

	private static int sumOfSeries(int[] nums) {
		int sumOfElements =0;
		int start=0;
		int end=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>=6 && nums[i]<=9) {
				continue;
			}else {
				sumOfElements+=nums[i];
			}
		}
//		int seriesSum=0;
//		for(int i=start;i<=end;i++) {
//			seriesSum+=nums[i];
//		}
//		return sumOfElements-seriesSum;
		return sumOfElements;
	}

}
