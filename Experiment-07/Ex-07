import java.util.Random;

class RandomThread extends Thread {

    public void run() {
        Random r = new Random();

        int n = r.nextInt(10) + 1;

        System.out.println("General number: " + n);

        if (n % 2 == 0) {
            SquareThread t2 = new SquareThread(n);
            t2.start();
        } else {
            CubeThread t3 = new CubeThread(n);
            t3.start();
        }
    }
}

class SquareThread extends Thread {

    int n;

    SquareThread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Square of " + n + " = " + (n * n));
    }
}

class CubeThread extends Thread {

    int n;

    CubeThread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Cube of " + n + " = " + (n * n * n));
    }
}

public class threethread{

    public static void main(String[] args) {

        RandomThread t1 = new RandomThread();

        t1.start();
    }
}
