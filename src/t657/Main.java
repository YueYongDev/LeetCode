package t657;

public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        System.out.println(main.judgeCircle("LL"));
    }

    public boolean judgeCircle(String moves) {
        int row=0;
        int column=0;
        for (char c:moves.toCharArray()){
            switch (c){
                case 'R':
                    row++;
                    break;
                case 'L':
                    row--;
                    break;
                case 'U':
                    column++;
                    break;
                case 'D':
                    column--;
                    break;
            }
        }
        return row == 0 && column == 0;
    }
}
