package prime4;

public class prime10 {

    public static void  main(String args[]) {
        int n = 10;
        int count = 0;

        // Prime check for single number n
        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                count++;
                break;
            }
        }
        if(count == 0){
            System.out.println(n + " is a prime");
        } else {
            System.out.println(n + " is not a prime");
        }

        System.out.println();

        // Array prime check
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int size = array.length;
        int prime_array[] = new int[array.length];
        int normal_array[] = new int[array.length];

        for(int i=0; i<size; i++) {
            boolean check = true;  // reset for each number

            if(array[i] < 2) {
                normal_array[i] = array[i];
                continue;
            }

            for(int j=2; j<=Math.sqrt(array[i]); j++) {
                if(array[i] % j == 0) {
                    check = false;
                    break;
                }
            }

            if(check) {
                prime_array[i] = array[i];
            } else {
                normal_array[i] = array[i];
            }
        }

        System.out.println("Prime Numbers:");
        for(int num : prime_array) {
            if(num != 0)
                System.out.print(num + " ");
        }

        System.out.println("\n\nNon-Prime Numbers:");
        for(int num : normal_array) {
            if(num != 0)
                System.out.print(num + " ");
        }
    }
}
