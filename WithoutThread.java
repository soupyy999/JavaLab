public class WithoutThread {

    void print() {
        for(int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        WithoutThread t1 = new WithoutThread();
        WithoutThread t2 = new WithoutThread();
        WithoutThread t3 = new WithoutThread();

        System.out.println("First:");
        t1.print();

        System.out.println("Second:");
        t2.print();

        System.out.println("Third:");
        t3.print();
    }
}