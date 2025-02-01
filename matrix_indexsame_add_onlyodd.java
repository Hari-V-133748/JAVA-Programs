import java.util.Scanner;
public class matrix_indexsame_add_onlyodd {
    public static void main(String[] args) 
	{
		int rows,columns;
		Scanner in = new Scanner(System.in);
        rows = in.nextInt();
        columns = in.nextInt();
    int[][] matrix= new int[rows][columns];  
    for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                matrix[i][j]=in.nextInt();
            }
        }
    int result =0,i,j;
    for(i=0;i<rows;i++) 
        {
    for(j=0;j<columns;j++) 
    {
        if(i==j && matrix[i][j]%2 !=0) 
        {
            result += matrix[i][i];
        }
    }
}
System.out.print(result);
}
}
/*      Output : 
                3 3
                1 2 3 
                4 5 6 
                7 8 9
                15
        Output when diagonal is even:
                3 3 
                2 3 1 
                5 4 6
                7 9 8
                0
*/