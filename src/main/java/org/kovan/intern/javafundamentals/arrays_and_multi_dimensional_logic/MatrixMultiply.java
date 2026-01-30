public class MatrixMultiply{
	public static int[][] multiply(int[][] a,int[][] b){
		int[][] res=new int[3][3];
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				res[i][j]=0;
				for(int k=0;k<3;k++){
					res[i][j]=a[i][k]*b[k][j];
				}
			}
		}
		return res;
	}
	public static void printMatrix(int[][] mat){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] B = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] C = multiply(A, B);
        System.out.println("The Result Matrix is");
        printMatrix(C);
	}
}