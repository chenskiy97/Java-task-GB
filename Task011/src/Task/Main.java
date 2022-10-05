package Task;

public class Main {
    public static void main(String[] args) {
        Pole2 arr = new Pole2();
        arr.fillPole();
        arr.set(12,13,-99);
        arr.print();
        System.out.println();

        var lee = new WaveAlgo(arr.getArray());
        lee.way(new Pole2D(7,12));
        arr.print();
    }
}
