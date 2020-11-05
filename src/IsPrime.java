import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of primes: ");
        int number = scanner.nextInt();
        int count = 0;
        int n = 2;
        while (count < number) {
            if (isPrime(n)) {
                count++;
                System.out.println(n);
            }
            n++;
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            return check;
        }
    }
}
