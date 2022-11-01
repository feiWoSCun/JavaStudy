package Sort;


public class PracticeToKMP {
    public static void main(String[] args) {
        char s='a';
        System.out.println((int) s);
       // String s = "bbabbcb";
        //kmp(s);
    }

    public static int[] kmp(String str) {
        char[] chars = str.toCharArray();
        int[] next = new int[str.length() + 10];
        for (int i = 1, j = 0; i < str.length(); i++) {
            while (j > 0 && chars[i] != chars[j]) {
                j = next[j-1];
            }
            if (chars[i] == chars[j]) {
                next[i] =++j;
            }
        }
            return next;

    }
}