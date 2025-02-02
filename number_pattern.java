import java.util.*;
class number_pattern{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to start : ");
        int n=sc.nextInt();
       System.out.print("Enter the number of rows : ");
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<=i;j++){
                System.out.print(n+" ");
            }
            n++;
            System.out.println();
        }
        int m=n-1;
        for(int i=a-2;i>=0;i--){
            m--;
            for(int j=0;j<=i;j++){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
/*       OUTPUT : 
Enter the number to start : 3
Enter the number of rows : 5
3 
4 4
5 5 5
6 6 6 6
7 7 7 7 7
6 6 6 6
5 5 5
4 4
3
 */
