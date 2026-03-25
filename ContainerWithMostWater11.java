class ContainerWithMostWater11{
    public static void main(String[] args) {
        int[] height = {8,7,2,1};
        System.out.println(maxArea(height));
    }

    

    public static  int maxArea(int[] height) {
        int maxarea = 0;
        int area ;
        int left =0;
        int right = height.length-1;
        while(left<right){
            area = (right-left) * Math.min(height[left], height[right]);
            maxarea = Math.max(area, maxarea);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
    
        return maxarea;
    }
}