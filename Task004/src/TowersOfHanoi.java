public class TowersOfHanoi {
    public static void solve(int n, String a, String b, String c) {
        if (n == 1) {
            System.out.println(a + " -> " + c);
        } else {
            solve(n - 1, a, c, b);
            System.out.println(a + " -> " + c);
            solve(n - 1, b, a, c);
        }
    }

    public static void main(String[] args) {
        int discs = 3;
        solve(discs, "1", "2", "3");
    }
}
