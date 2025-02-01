import java.util.*;
public class matsum {
    public static void main(String[] args)
	{
	    Scanner sc= new Scanner(System.in);
	    int i,j;
	    int row= sc.nextInt();
	    int col= sc.nextInt();
        int matrix[][]=new int[row][col];
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++){
            matrix[i][j]= sc.nextInt();}
        }
        System.out.print(matrixSum(row,col,matrix));
    }
    public static int matrixSum(int rows, int columns, int matrix[][])
    {
    int i,j,sum=0;
    for (i = 0; i < rows; i++) {
      for (j = 0; j < columns; j++) {
         sum += matrix[i][j];
      }
   }
   return sum;
}
}

/*     OUTPUT : 
              3 3 
              1 2 3
              4 5 6
              7 8 9
              45
 */

