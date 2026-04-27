import java.util.Scanner;

public class ArrayExample {

    int arr[] = new int[5];

    // method to take input
    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 elements:");
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    // normal output using for loop
    void output1() {
        System.out.println("Array elements (method 1):");
        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // output using for-each loop
    void output2() {
        System.out.println("\nArray elements (method 2):");
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }

    // reverse display
    void reverse() {
        System.out.println("\nArray in reverse:");
        for(int i = 4; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        ArrayExample a = new ArrayExample();

        a.input();
        a.output1();
        a.output2();
        a.reverse();
    }
    
}