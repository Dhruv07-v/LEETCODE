import java.util.Arrays;
class majority169 {
    public int majorityElement(int[] num) {
        Arrays.sort(num);

        int index = -1;
        int maxcount = 0;
        int tempCount = 1;
        int length = num.length / 2;

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] == num[i + 1]) {
                tempCount++;
            } else {
                if (tempCount > maxcount && tempCount > length) {
                    maxcount = tempCount;
                    index = i;
                }
                tempCount = 1;
            }
        }

        // Last group check
        if (tempCount > maxcount && tempCount > length) {
            maxcount = tempCount;
            index = num.length - 1;
        }

        // ✅ Final check
        if (index != -1) {
            System.out.println(num[index]);
        } else {
            System.out.println("No majority element");
        }
        return num[index];
    }
}