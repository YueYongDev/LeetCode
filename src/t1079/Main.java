package t1079;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.numTilePossibilities("AAABBC"));
    }

    public int numTilePossibilities(String tiles) {
        int[] counter = new int[26];
        char[] cs = tiles.toCharArray();
        for (char c : cs) {
            counter[c - 'A']++;
        }
        return dfs(counter);
    }

    private int dfs(int[] counter) {
        int res = 0;
        for (int i = 0; i < 26; i++) {
            if (counter[i] == 0) {
                continue;
            }
            res += 1;
            counter[i] -= 1;
            res += dfs(counter);
            counter[i] += 1;
        }
        return res;
    }
}
