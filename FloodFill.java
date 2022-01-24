//https://leetcode.com/problems/flood-fill/

class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int prevColor=image[sr][sc];
        if(prevColor==newColor){
            return image;
        }
        flood(image,sr,sc,newColor,prevColor);
        return image;
    }

    public static void flood(int [][]image,int i,int j,int newColor,int prevColor){
        if(i<0 || i>=image.length || j<0 || j>=image[i].length || image[i][j] != prevColor){
            return;
        }
        image[i][j]=newColor;
        flood(image,i-1,j,newColor,prevColor);
        flood(image,i+1,j,newColor,prevColor);
        flood(image,i,j-1,newColor,prevColor);
        flood(image,i,j+1,newColor,prevColor);

    }


}