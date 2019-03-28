package t717;

class Main {

    public static void main(String[] args) {

    }

    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        for (i = 0; i < bits.length - 1; ) {
            if (bits[i] == 0) {
                i++;
            } else
                i += 2;
        }
        System.out.println(i);
        return i == bits.length - 1;
    }
}
