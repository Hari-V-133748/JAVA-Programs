/* Zigzag Conversionin */
import java.util.*;
public class Zigzag_Conversionin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(str);
            return;
        }
        int m = str.length();
        char[] a = new char[m];
        int i = 0, j = 0, z = 0;
        for (int k = 0; k < m; k++) {
            a[k] = (char) i;
            if (z == 0) {
                i++;
            } else if (z == 1) {
                i--;
            }
            if (i == n) {
                i = n - 2;
                z = 1;
            }
            if (i == -1) {
                i = 1;
                z = 0;
            }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (a[j] == i) {
                    System.out.print(str.charAt(j));
                }
            }
        }
        System.out.println();
    }
}

/*     
OUTPUT : 
qrrc
3
qrcr
 */