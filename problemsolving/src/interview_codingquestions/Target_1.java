package interview_codingquestions;

public class Target_1 {
	 public static int searchInsert(int[] nums, int target) {
	        int left = 0, right = nums.length - 1;
	        while (left <= right) {
	            int mid = (left + right) / 2;
	            if (nums[mid] == target) {
	                return mid;
	            } else if (nums[mid] < target) {
	                left = mid + 1;
	            } else {
	                right = mid - 1;
	            }
	        }
	        return right;
	    }
	 public static void main(String[] args) {
//		int[] array = {5,6,7,8,9,10,1,2,3};
//			int	 target = 1;
			System.out.println(2^1);
			//System.out.println(searchInsert(array,target));
	}
}
