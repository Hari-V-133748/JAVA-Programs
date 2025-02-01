import java.util.*;
    public class diamond_another_mtd {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter number of rows in diamond : ");
            int n=sc.nextInt();
            System.out.println("The pattern is : ");
            // Top half of the diamond
            for (int i = 1; i <= n; i++) {
                // Print spaces
                System.out.print(" ".repeat(n - i));
                // Print stars
                System.out.print("*".repeat(2 * i - 1));
                // Move to the next line
                System.out.println();
            }
    
            // Bottom half of the diamond
            for (int i = n - 1; i >= 1; i--) {
                // Print spaces
                System.out.print(" ".repeat(n - i));
                // Print stars
                System.out.print("*".repeat(2 * i - 1));
                // Move to the next line
                System.out.println();
            }
        }
    }