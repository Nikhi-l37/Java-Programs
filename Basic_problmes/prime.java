import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size. Exiting.");
            sc.close();
            return; // exit the program
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Prime numbers in the array are:");
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int count = 0;

            if (num > 1) { // 0 and 1 are not prime
                for (int j = 1; j <= num; j++) {
                    if (num % j == 0) {
                        count++;
                    }
                }
                if (count == 2) { // prime if exactly 2 divisors
                    System.out.print(num + " ");
                }
            }
        }

        sc.close();
    }
}
