package t929;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/unique-email-addresses/
 */

public class Main {
    public static void main(String[] args) {
        String[] ss={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        Main main=new Main();
        System.out.println(main.numUniqueEmails(ss));
    }

    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String s : emails) {
            String[] ss = s.split("@");
            ss[0]=ss[0].replace(".","");
            int index = ss[0].indexOf('+');
            if (index != -1) {
                StringBuilder sb=new StringBuilder(ss[0]);
                sb.delete(index,ss[0].length());
                set.add(sb.append(ss[1]).toString());
            }
        }
        return set.size();
    }
}
