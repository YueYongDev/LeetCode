package t748;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/shortest-completing-word/
 */

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"enough", "these", "play", "wide", "wonder", "box", "arrive", "money", "tax", "thus"};
        String licensePlate = "OgEu755";
        System.out.println(solution.shortestCompletingWord(licensePlate, words));
    }

    public String shortestCompletingWord(String licensePlate, String[] words) {
        String licenseplate = licensePlate.replaceAll("[0-9\\s]+", "").toLowerCase();
        Map<Integer, Integer> map = new HashMap<>();
        for (char c : licenseplate.toCharArray()) {
            map.put(c - 'a', map.getOrDefault(c - 'a', 0) + 1);
        }
        Arrays.sort(words, Comparator.comparingInt(String::length));
        for (String word : words) {
            if (word.length() < licenseplate.length())
                continue;
            int[] x = new int[26];
            for (char c : word.toLowerCase().toCharArray()) {
                if (c >= 'a' && c <= 'z')
                    x[c - 'a']++;
            }
            boolean flag = true;
            for (int key : map.keySet()) {
                if (x[key] < map.get(key)) {
                    flag = false;
                    break;
                }
            }
            if (flag) return word;
        }
        return null;
    }
}