public class task002 {
    static int[] solve(int a, int b, int c, int d, int[] arr) {
        for (int index = a + 1; index <= b; index++) {
            if (index % d == 0) {
                arr[index] = arr[index - c] + arr[index / d];
            } else {
                arr[index] = arr[index - c];
            }
        }
        return arr;
    }

    static String routeRec(int a, int b, int c, int d, int[] arr) {
        String solution = "";
        if (arr[b] == 0)
            return solution;
        if (b == a)
            return solution;
        if ((b % d == 0) && (arr[b / d] != 0))
            solution = routeRec(a, (b / d), c, d, arr) + "k2 ";
        else if ((b - c >= a) && (arr[b - c] != 0))
            solution = routeRec(a, (b - c), c, d, arr) + "k1 ";
        return solution;
    }

    static String routeRec1(int a, int b, int c, int d, int in) {
        String solution = "";
        if (in == b)
            return solution;
        if (b == a)
            return solution;
        if ((in * d <= b))
            solution = routeRec1(a, b, c, d, in * d) + " 2q";
        else if ((in + c <= b))
            solution = routeRec1(a, b, c, d, in + c) + " 1q";
        return solution;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 15;
        int c = 1;
        int d = 3;
        int ind = a;
        int[] arr = new int[b + 1];
        arr[a] = 1;
        var so = solve(a, b, c, d, arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d -> %d\n", i, so[i]);
        }
        System.out.println("\nk1 - '+'; k2 - '*'");
        String routeRecString = routeRec(a, b, c, d, so);
        String routeRecString1 = routeRec1(a, b, c, d, ind);
        System.out.printf("\nОдин из возможных мартшрутов: \n%s", routeRecString);
        System.out.printf("\nВторой из возможных мартшрутов: \n%s", new StringBuilder(routeRecString1).reverse().toString());
    }
}