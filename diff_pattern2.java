import java.util.*;
public class diff_pattern2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        char ch=sc.next().charAt(0);
        for(int i=0;i<a;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<a-i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
/*   OUTPUT : 
5
@
@@@@@
 @@@@
  @@@
   @@
    @
 */