import java.util.*;
public class matrix_indexsame_only_odd {
    public static void main(String[] args)
	{
	    Scanner sc= new Scanner(System.in);
	    int i,j;
	    int rows= sc.nextInt();
	    int columns= sc.nextInt();
        int m[][]=new int[rows][columns];
        for (i = 0; i < rows; i++)
        {
            for (j = 0; j < columns; j++)
            {
                m[i][j]= sc.nextInt();
            }
        }
        productMatrix(rows,columns,m);
    }public static void productMatrix(int rows,int columns,int matrix[][])
    {
    int ans ;
    int result =1,i,j;
    for(i=0;i<rows;i++) 
    {
        for(j=0;j<columns;j++) 
        {
            if(i==j && matrix[i][j]%2 !=0) 
            {
                result *= matrix[i][j];
            }
        }
    }
        if(result<=1)
            ans= 0;
        else
            ans=result;
        System.out.println(ans);
    }

}
/*    OUTPUT:
           3 3 
            1 2 3
            4 5 6
            7 8 9
            45

        OUTPUT if diagonal is even: 
         3 3
         2 3 1
         5 4 6
         7 9 8
         0
 */

