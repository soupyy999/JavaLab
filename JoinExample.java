class MyThread2 extends Thread {

    public void run() {
        for(int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}

public class JoinExample {

    public static void main(String[] args) {

        MyThread2 t1 = new MyThread2();
        MyThread2 t2 = new MyThread2();
        MyThread2 t3 = new MyThread2();

        try {
            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
