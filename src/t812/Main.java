package t812;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        int[][] points = {{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}};
        System.out.println(main.largestTriangleArea(points));
    }

    public double largestTriangleArea(int[][] points) {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < points.length - 2; i++) {
            for (int j = i + 1; j < points.length - 1; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    double area = (points[i][0] * points[j][1] +
                            points[j][0] * points[k][1] +
                            points[k][0] * points[i][1] -
                            points[i][0] * points[k][1] -
                            points[j][0] * points[i][1] -
                            points[k][0] * points[j][1]) * 0.5;
                    if (Math.abs(area) > max) max = Math.abs(area);
                }
            }
        }
        return max;
    }
}
