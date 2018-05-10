package t28;

public class Main {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(new Main().strStr(haystack, needle));
    }

    //第一种方法，直接使用java自带的indexof函数
//    public int strStr(String haystack, String needle) {
//        return haystack.indexOf(needle);
//    }

    public int strStr(String haystack, String needle) {
        if (needle == null) return 0;
        if (needle.length() > haystack.length()) return -1;
        for (int i = 0; i < haystack.length(); i++) {
            //如果haystack的减去needle后的剩余长度不足i的话，就没有必要继续比下去了
            if (haystack.length() - needle.length() < i) return -1;

            //临时变量m用于记录
            int m = i;
            for (int j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) == haystack.charAt(m)) {
                    if (j == needle.length() - 1) {
                        return i;
                    }
                    m++;
                } else {
                    break;
                }
            }
        }
        return -1;
    }
}
