class findMissingAndRepeatedValues2965 {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len = grid.length;
        int missing = -1;
        int twice = -1;
        for(int i =1 ; i<=len*len ;i++){
            boolean misval = findMissing(i, grid);

            boolean twiceval = twiceNumber(i, grid);
            if(!misval){
                missing = i;
            }

            if(!twiceval){
                twice = i;
            }
        }
        int arr[] = {twice,missing};
        return arr;
    }


    public static boolean findMissing(int num,int[][] grid){
        boolean temp = false;
        for(int i = 0; i<grid.length;i++){
            for(int j = 0 ;j<grid[0].length;j++){
                if(grid[i][j] == num){
                    temp = true;
                }
            }
        }
        return temp;
    }

    public static boolean  twiceNumber(int num,int[][] grid) {
        boolean temp = true;
        int count = 0;


        for(int i = 0; i<grid.length;i++){
            for(int j = 0 ;j<grid[0].length;j++){
                if(grid[i][j] == num){
                    count++;
                }
            }
        }

        if(count == 2){
            temp = false;
        }

        return temp;
    }

}