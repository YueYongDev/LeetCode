package t832;

public class Main {
    public static void main(String[] args) {
        int[][] B = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] A=new Main().flipAndInvertImage(B);

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] flipAndInvertImage(int[][] A) {
        int row=A.length;
        int column=A[0].length;
        int[][] res=new int[row][column];

        for (int i = 0; i < A.length; i++) {
            for (int j = A[i].length-1; j >=0 ; j--) {
                res[i][column-j-1]=reverse(A[i][j]);
            }
        }
        return  res;
    }

    private int reverse(int x){
        if (x==0)
            return 1;
        else return 0;
    }
}
