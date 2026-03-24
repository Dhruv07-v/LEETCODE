import java.util.Arrays;
class meargeSortedArray88 {
    public static void main(String[] args) {
        int num1[] = {0};
        int num2[] = {1};
        int m = 0;
        int n = 1;

        meargeSortedArray88 sc = new meargeSortedArray88();
        sc.merge(num1, m, num2, n);

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m<=0){
            for(int i =0;i<n;i++){
                nums1[i] = nums2[i];
            }
            
        }else{
            for(int i = 0;i<n;i++){
                nums1[i+m] = nums2[i];
            }
            Arrays.sort(nums1);
        }
        for(int i =0; i<nums1.length;i++){
            System.out.println(nums1[i]);
        }
    }
}