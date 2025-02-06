import java.util.*;
public class area_of_swimming_pool{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int l=sc.nextInt();
        int b=sc.nextInt();
        double pi=3.14;
        double cir= pi*r*2;
        double rec=2*(l+b);
        System.out.printf("%.2f\n",cir);
        System.out.printf("%.2f\n",rec);
        System.out.println(cir>rec?"Circular Swimming pool covers larger area":"Rectangular swimming pool has larger area");
    }
}
/* OUTPUT : 
100
75
471.00
350.00
Circular Swimming pool covers larger area
*/