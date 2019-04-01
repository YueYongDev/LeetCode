package t784;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private List<String> list;

    public List<String> letterCasePermutation(String S) {
        //1.获得char型数组
        //2.递归
        //2.1如果当前下表数组元素大于等于'a'小于等于'z'或大于等于'A'小于等于'Z'转换为大写或小写
        //2.2边界如果索引值等于S.length()那么就将char数组转换为String并加入lsit里
        int length = S.length();
        int index = 0;
        char[] arr = S.toCharArray();
        list = new ArrayList<String>();
        dfs(arr, index, length);
        return list;
    }

    public void dfs(char[] arr, int index, int length) {
        if (index == length) {
            list.add(new String(arr));
            return;
        }
        if (arr[index] >= 'a' && arr[index] <= 'z') {
            dfs(arr, index + 1, length);
            arr[index] = (char) (arr[index] - 32);
            dfs(arr, index + 1, length);
        } else if (arr[index] >= 'A' && arr[index] <= 'Z') {
            dfs(arr, index + 1, length);
            arr[index] = (char) (arr[index] + 32);
            dfs(arr, index + 1, length);
        } else {
            dfs(arr, index + 1, length);
        }
    }

    public static void main(String[] args) {
        Main main=new Main();
        main.letterCasePermutation("a1b2");
    }
}
