package array_basic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3_Sum_15 {
	
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length-2;i++) {
			
			// Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
			int left = i+1 ,right = nums.length-1;
			while(left<right) {
				int sum = nums[i] + nums[left] + nums[right] ;
				if(sum==0) {
					result.add(Arrays.asList(nums[i] , nums[left] , nums[right])) ;
					
//					// Skip duplicate elements
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

					left++ ;
					right--;
				}
				else if(sum<0) {
					left++ ;
				}else {
					right-- ;
				}
			}
		}
		return result ;
	}

	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));
	}

}
