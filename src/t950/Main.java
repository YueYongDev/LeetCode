package t950;

import java.util.*;

public class Main {

    public int[] deckRevealedIncreasing(int[] deck) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < deck.length; i++) {
            list.add(i + 1);
        }
        int len = list.size();
        boolean flag = true;
        for (int i = 0; i < list.size(); i++) {
            if (!flag) {
                int temp = list.get(i);
                list.remove(i);
                i--;
                list.add(temp);
                flag = true;
            } else {
                flag = false;
            }
        }
        Arrays.sort(deck);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(list.get(i), deck[i]);
        }
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = map.get(i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] a = {17, 13, 11, 2, 3, 5, 7};
        int[] res = main.deckRevealedIncreasing(a);
        for (int x:res){
            System.out.println(x);
        }
    }

    private void print(List<Integer> list) {
        for (int x : list) {
            System.out.println(x);
        }
    }
}
