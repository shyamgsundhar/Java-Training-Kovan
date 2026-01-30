public class JaggedArrays{
	public static void main(String[] args) {
		int[][] jarr = new int[][]{
			new int[] {1,2},
			new int[] {3,1,2},
			new int[] {1,4,5,7}
		};
		for(int i=0;i<jarr.length;i++){
			for(int j=0;j<jarr[i].length;j++){
				System.out.print(jarr[i][j]+" ");
			}
			System.out.println();
		}
	}
}