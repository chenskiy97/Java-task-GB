import java.util.ArrayDeque;
import java.util.Deque;

public class Test {
    public static void main(String[] args) {
        int size = 10;
        Integer[][] array = new Integer[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[j][i] = 0;
            }

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[0][j] = -1;
                array[size - 1][j] = -1;
                array[i][0] = -1;
                array[i][size - 1] = -1;
            }
        }


        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%4d", array[j][i]);
            }
            System.out.println();

        }

        int start = array[1][1];
        int finish = array[3][8];

//        Deque<Integer> dq = new ArrayDeque<>();


    }
}

