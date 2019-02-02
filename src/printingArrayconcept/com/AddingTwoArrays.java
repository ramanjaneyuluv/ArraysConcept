package printingArrayconcept.com;

public class AddingTwoArrays {

	public static void main(String[] args) {
	/*	int rows=2, coloums=3;
		int[][] firstMatrix={{1,2,3},{4,5,6}};
		int[][] secondMatrix={{7,8,9},{10,11,12},{13,14,15}};
		int[][] sum=new int[rows][coloums];
		for(int i=0;i<rows;i++){
			for(int j=0;j<coloums;j++){
				sum[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
			}
		}
		System.out.println("sum of two matrix is:");
		for(int[] row:sum){
			for(int coloum:row){
				System.out.println(coloum+"  ");
			}
			System.out.println();
		}
	*/	
		  int rows = 2, columns = 3;
	        int[][] firstMatrix = { {2, 3, 4}, {5, 2, 3} };
	        int[][] secondMatrix = { {-4, 5, 3}, {5, 6, 3} };

	        // Adding Two matrices
	        int[][] sum = new int[rows][columns];
	        for(int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
	            }
	        }

	        // Displaying the result
	        System.out.println("Sum of two matrices is: ");
	        for(int[] row : sum) {
	            for (int column : row) {
	                System.out.print(column + "    ");
	            }
	            System.out.println();
	        }
	}

}
