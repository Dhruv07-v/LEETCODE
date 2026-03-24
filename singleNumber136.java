import java.util.HashSet;

class singleNumber136 {
    public static int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int totalarr = 0;
        int totalset = 0;
        for(int i = 0; i<nums.length;i++){
            hs.add(nums[i]);
            totalarr +=nums[i];
        }

        for(int num : hs){
            totalset += num;
        }

        int num = (totalset*2) - totalarr  ;
        return num;

    }    


    public static void main(String[] args) {
        int num[] = {1,2,2};
        System.out.println(singleNumber(num));
    }
}