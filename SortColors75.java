class SortColors75{
    public static void main(String[] args) {
        int nums[] ={2,0,2,1,1,0};
        sortColors(nums);

    }

    public static void sortColors(int[] nums) {
        int arr[] = new int[3];
        for(int i = 0;i<nums.length;i++){
            arr[nums[i]]++;
        }     
        int j = 0;
        for(int i = 0;i<arr.length;i++){
            while(arr[i]!=0){
                nums[j] = i;
                j++;
                arr[i]--;
            }
        }
    }
}