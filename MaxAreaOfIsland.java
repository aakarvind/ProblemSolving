class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int result=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)
                    result=Math.max(result,area(grid,i,j));
            }
        }

        return result;
    }

    public int area(int [][]grid,int i,int j){
        int count=1;
        if(i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j]==0 )
            return 0;
        grid[i][j]=0;

        count+=area(grid,i+1,j);
        count+=area(grid,i-1,j);
        count+=area(grid,i,j+1);
        count+=area(grid,i,j-1);

        return count;
    }
}