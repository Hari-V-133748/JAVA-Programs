 import java.util.Scanner;
public class prime_with_dig {

    // Function to check if a number is prime
    public static int isPrime(int num) {
        if (num < 2) return 0;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return 0;
        }
        return 1;
    }

    // Function to calculate 10^nod (power of 10)
    public static int power(int nod) {
        return (int) Math.pow(10, nod);
    }

    // Function to print prime numbers between 'start' and '10^nod'
    public static int printPrime(int start, int nod) {
        int from, to, num, safe = -1;
        from = start;
        to = power(nod);

        if (from > to) {
            System.out.println("INVALID INPUT");
            return 0;
        }

        for (num = from; num < to; num++) {
            if (isPrime(num) == 1) {
                if (safe != -1)
                    System.out.print(safe + ",");
                safe = num;
            }
        }

        if (safe != -1)
            System.out.print(safe); // Print the last prime number without a trailing comma
        
        return 0;
    }

    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter starting number: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter number of digits (nod): ");
        int nod = scanner.nextInt();
        
        printPrime(start, nod);
        scanner.close();
    }
}

/*
     OUTPUT : 
     input:
     Enter starting number: 1
     Enter number of digits (nod): 2
      output: 
      2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97
 */