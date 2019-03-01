package t824;

public class Main {
    public static void main(String[] args) {
        Main main=new Main();
        System.out.println(main.toGoatLatin("The quick brown fox jumped over the lazy dog"));
    }

    public String toGoatLatin(String S) {
        String[] ss = S.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<ss.length;i++) {
            String s=ss[i];
            StringBuilder sb = new StringBuilder(s);
            if (isVowel(s.charAt(0)))
                sb.append("ma");
            else{
                sb.insert(sb.length(),s.charAt(0));
                sb.deleteCharAt(0);
                sb.append("ma");
            }
            for (int j=1;j<=i+1;j++){
                sb.append('a');
            }
            stringBuilder.append(sb);
            stringBuilder.append(" ");
        }
        return stringBuilder.deleteCharAt(stringBuilder.length()-1).toString();
    }

    // 判断是否是元音
    public boolean isVowel(char c) {
        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')
            return true;
        return false;
    }

}
