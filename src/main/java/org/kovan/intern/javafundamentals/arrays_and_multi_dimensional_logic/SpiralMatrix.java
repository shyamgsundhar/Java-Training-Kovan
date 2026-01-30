public class SpiralMatrix{
	public static void main(String[] args) {
		int n=5;
		int top=0;
		int bottom=n-1;
		int left=0;
		int right=n-1;
		int ind=1;
		int mat[][]=new int[n][n];
		while(ind<=n*n){
			for(int i=left;i<=right && i<=n*n;i++){
				mat[top][i]=ind++;
			}
			top++;
			for(int i=top;i<=bottom && i<=n*n;i++){
				mat[i][right]=ind++;
			}
			right--;
			for(int i=right;i>=left && i<=n*n;i--){
				mat[bottom][i]=ind++;
			}
			bottom--;
			for(int i=bottom;i>=top && i<=n*n;i--){
				mat[i][left]=ind++;
			}
			left++;
		}
		System.out.println("The Result Matrix ");
		for(int i=0;i<mat.length;i++){
			for(int j=0;j<mat[0].length;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}