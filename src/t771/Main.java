package t771;

/**
 * https://leetcode-cn.com/problems/jewels-and-stones/
 */
public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        System.out.println(main.numJewelsInStones("z","ZZ"));
    }

    public int numJewelsInStones(String J, String S) {
        char[] js = J.toCharArray();
        int sum = 0;
        for (int i = 0; i < S.length(); i++) {
            if (isContains(js,S.charAt(i)))
                sum++;
        }
        return sum;
    }

    boolean isContains(char[] chars,char c){
        for (char c1:chars){
            if (c==c1)
                return true;
        }
        return false;
    }


}
