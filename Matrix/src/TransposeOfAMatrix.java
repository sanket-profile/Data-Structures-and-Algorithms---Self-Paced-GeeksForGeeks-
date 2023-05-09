
public class TransposeOfAMatrix {

	public static void transposeOfAMatrix(int[][] arr) {
		int temp = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j <= i ; j++) {
				temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] x = {{1,2,3},{4,5,6},{7,8,9}};
		transposeOfAMatrix(x);
	}

}
