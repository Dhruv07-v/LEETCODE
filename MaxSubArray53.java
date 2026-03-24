class MaxSubArray53{
    public static void main(String[] args) {
        int num[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(num));
    }

    public static int maxSubArray(int[] nums) {
        int currsum = nums[0];
        int maxsum = nums[0];

        for(int i = 1 ;i<nums.length;i++){
            currsum = Math.max(nums[i], currsum + nums[i]);
            maxsum = Math.max(currsum, maxsum);
        }
        return maxsum;

    }
}