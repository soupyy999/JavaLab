public class ExceptionExample {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

    
        try {
            System.out.println(arr[10]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range");
        }

    
        try {
            int a = 10, b = 0;
            System.out.println(a / b);
        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}