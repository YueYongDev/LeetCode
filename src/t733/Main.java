package t733;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] res = main.floodFill(image, 1, 1, 2);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int row = image.length;
        int column = image[0].length;

        if (newColor == image[sr][sc]) return image;

        int oldColor = image[sr][sc];

        image[sr][sc] = newColor;

        if (sr > 0 && image[sr - 1][sc] == oldColor)
            floodFill(image, sr - 1, sc, newColor);
        if (sr < row - 1 && image[sr + 1][sc] == oldColor)
            floodFill(image, sr + 1, sc, newColor);
        if (sc > 0 && image[sr][sc - 1] == oldColor)
            floodFill(image, sr, sc - 1, newColor);
        if (sc < column - 1 && image[sr][sc + 1] == oldColor)
            floodFill(image, sr, sc + 1, newColor);
        return image;
    }

}
