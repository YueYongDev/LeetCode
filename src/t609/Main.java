package t609;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] paths = {};
        Main main = new Main();
        List<List<String>> result = main.findDuplicate(paths);
        result.forEach(System.out::println);
    }

    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> res = new ArrayList<>();
        // 构建一个map，文件内容->文件路径
        Map<String, List<String>> map = new HashMap<>();
        for (String s : paths) {
            String[] ss = s.split(" ");
            String path = ss[0] + "/";
            for (int i = 1; i < ss.length; i++) {
                int index = ss[i].indexOf("(");
                String filename = ss[i].substring(0, index);
                String content = ss[i].substring(index + 1, ss[i].length() - 1);
                List<String> list = map.get(content);
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(path + filename);
                map.put(content, list);
            }
        }

        //遍历map，获取结果
        for (List<String> list : map.values()) {
            //表示有重复文件
            if (list.size() > 1) {
                res.add(list);
            }
        }
        return res;
    }
}
