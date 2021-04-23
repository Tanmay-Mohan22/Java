
	public class Matrix {
		   public static void printMatrix(int M[][],
		                            int rowSize,
		                            int colSize)
		    {
		        for (int i = 0; i < rowSize; i++) {
		            for (int j = 0; j < colSize; j++)
		                System.out.print(M[i][j] + " ");
		 
		            System.out.println();
		        }
		    }
		    static int[][] add(int A[][], int B[][],
		                       int size)
		    {
		        int i, j;
		        int C[][] = new int[size][size];
		 
		        for (i = 0; i < size; i++)
		            for (j = 0; j < size; j++)
		                C[i][j] = A[i][j] + B[i][j];
		 
		        return C;
		    }
		 
		    public static void main(String[] args)
		    {
		        int size = 4;
		 
		        int A[][] = { { 1, 1, 1, 1 },
		                      { 2, 2, 2, 2 },
		                      { 3, 3, 3, 3 },
		                      { 4, 4, 4, 4 } };
		        System.out.println("\nMatrix A:");
		        printMatrix(A, size, size);
		 
		        int B[][] = { { 1, 1, 1, 1 },
		                      { 2, 2, 2, 2 },
		                      { 3, 3, 3, 3 },
		                      { 4, 4, 4, 4 } };
		       
		        System.out.println("\nMatrix B:");
		        printMatrix(B, size, size);
		 
		    
		        int C[][] = add(A, B, size);
		 
		  
		        System.out.println("\nResultant Matrix:");
		        printMatrix(C, size, size);
		        
		        int c[][]=new int[4][4];  //3 rows and 3 columns  
		        
			      System.out.println("\nMultiplied Matrix:");

		      for(int i=0;i<4;i++){    
		      for(int j=0;j<4;j++){    
		      c[i][j]=0;      
		      for(int k=0;k<4;k++)      
		      {      
		      c[i][j]+=A[i][k]*B[k][j];      
		      }//end of k loop  
		      System.out.print(c[i][j]+" ");  //printing matrix element  
		      }//end of j loop  
		      System.out.println();//new line 
		    
		      }}}

