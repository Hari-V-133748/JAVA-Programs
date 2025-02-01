import java.util.*;
public class one_pattern {
    public static void main(String[] args)
	{
	    Scanner sc= new Scanner(System.in);
	    int n;
        n=sc.nextInt();
        patternPrint(n);
    }
    public static void patternPrint(int num)
    {
         int print =1,i, j;
    for (i = 0; i < num; i++) {
        for (j = 0; j <= i; j++) {  
            System.out.print(print);
        }
        System.out.println(); 
    }
}
}

/*      Output:  
             5
             1
             11
             111
             1111
             11111
 */