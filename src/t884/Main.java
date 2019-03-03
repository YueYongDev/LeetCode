package t884;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Main main=new Main();
        String[] res=main.uncommonFromSentences("this apple is sweet","this apple is sour");
    }

    public String[] uncommonFromSentences(String A, String B) {
        String[] ss = (A + " " + B).split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String s : ss) {
            if (map.containsKey(s))
                map.put(s, map.get(s) + 1);
            else
                map.put(s, 1);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> args : map.entrySet()) {
            if (args.getValue()==1)
                list.add(args.getKey());
        }
        return list.toArray(new String[list.size()]);
    }
}
