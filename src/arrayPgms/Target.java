package arrayPgms;

public class Target {

	public int findTargetSumWays(int[] nums, int target) {
		
		
//		int sum = 0;
//        for (int i = 0; i < a.length; i++) {
//            sum += a[i];
//            if (sum == target) {
//                System.out.println("The target sum is reached at index " + i);
//                break;
//            }
//        }
//
//        if (sum != target) {
//            System.out.println("The target sum is not reached");
//        }
		
		int s = 0;
        int n = nums.length;
        for(int num : nums) s += num;
        target += s;
        if(target < 0 || target % 2 != 0) 
        return 0; 
        // s+t must be non neg, or cannot reach target
        target /= 2;

        int[] dp = new int[target+1]; // flatten to one dimension
        dp[0] = 1;
        for(int i = 0; i < n; ++i){
            for(int c = target; c >= 0; --c){
                // if(c < nums[i]){ don't need this part '
                    // dp[c] = dp[c];
                if(c >= nums[i]){
                    dp[c] = dp[c] + dp[c-nums[i]];
                }
            }
        }
        return dp[target];
	} 
	public static void main(String[] args) {
		 int[]nums= {1,5,4,7,8,1,4,2,5};
		Target tr=new Target();
		tr.findTargetSumWays(nums,15);
		
	}
}
