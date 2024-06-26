import java.util.*;
public class mul_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to get the multiplication table : ");
        int a=sc.nextInt();
        System.out.print("Enter the range of table : ");
        int b=sc.nextInt();
        for(int i=1;i<=b;i++){
            System.out.println(a+" X "+i+" = "+(a*i));
        }

    }
    
}
