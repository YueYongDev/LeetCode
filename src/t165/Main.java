package t165;

public class Main {
    public static void main(String[] args) {

    }

    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int n = Math.max(v1.length, v2.length);
        for (int i = 0; i < n; i++) {
            int v1Int = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int v2_int = i < v2.length ? Integer.parseInt(v2[i]) : 0;
            if (v1Int == v2_int) {
                continue;
            }
            if (v1Int > v2_int) {
                return 1;
            } else {
                return -1;
            }
        }
        return 0;
    }
}
