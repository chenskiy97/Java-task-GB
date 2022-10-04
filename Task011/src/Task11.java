public class Task11 {

    // 1 2 4 5 0 4
    // 1 5 5 7 4 0 2

//    static int i = 0;
    static int MLS(String a, String b) {
//        i++;
        if (a.length() == 0 || b.length() == 0) {
            return 0;
        } else if (a.charAt(0) == b.charAt(0)) {

            return MLS(a.substring(1), b.substring(1)) + 1;
        } else {
            return Math.max(MLS(a.substring(1), b), MLS(a, b.substring(1)));
        }
    }


    public static void main(String[] args) {
        System.out.println(MLS("124504", "1557402"));
//        System.out.println(i);
    }
}
