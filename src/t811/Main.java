package t811;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String[] ss = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        main.subdomainVisits(ss);
    }

    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String cpdomain : cpdomains) {
            String[] strings = cpdomain.split(" ");
            int count = Integer.parseInt(strings[0]);
            List<String> subStrings = subString(strings[1]);
            for (String s : subStrings) {
                if (map.containsKey(s))
                    map.put(s, map.get(s) + count);
                else
                    map.put(s, count);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result.add(entry.getValue() + " " + entry.getKey());
        }
        return result;

    }

    public List<String> subString(String s) {
        List<String> stringList = new ArrayList<>();
        String[] strings = s.split("\\.");
        String temp = "";
        for (int i = strings.length - 1; i >= 0; i--) {
            if (i == strings.length - 1)
                temp = strings[i];
            else
                temp = strings[i] + "." + temp;
            stringList.add(temp);
        }
        return stringList;
    }
}
