
public class SpiralTraversalOfMatrix {

	public static void printSpiralTraversal(int[][] arr , int row , int column , int rowStart , int rowEnd , int columnStart , int columnEnd) {
		if(rowStart > rowEnd) {
			return;
		}
		if(row == 1) {
			for(int i = columnStart ; i < columnEnd ;i++) {
				System.out.print(arr[0][i] + " ");
			}
			return;
		}else if(column == 1) {
			for(int i = rowStart ; i < row ;i++) {
				System.out.print(arr[i][0] + " ");
			}
			return;
		}else if(row == 1 && column == 1){
			System.out.print(arr[row][column] + " ");
			return;
		}else {
			for(int i = columnStart ; i <= columnEnd ; i++) {
				System.out.print(arr[rowStart][i] + " ");
			}
			for(int i = rowStart + 1 ; i <= rowEnd ; i++) {
				System.out.print(arr[i][columnEnd] + " ");
			}
			for(int i = columnEnd -1 ; i >= columnStart ; i--) {
				System.out.print(arr[rowEnd][i] + " ");
			}
			for(int i = rowEnd -1 ; i >= rowStart + 1 ; i--) {
				System.out.print(arr[i][0] + " ");
			}
			printSpiralTraversal(arr, row/2, column/2, rowStart + 1, rowEnd - 1, columnStart + 1, columnEnd - 1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] x = {{1,2,3},{4,5,6},{7,8,9}};
		printSpiralTraversal(x , 3 , 3 , 0 , 2 , 0 , 2);
		if(x.length % 2 != 0) {
			System.out.println(x[x.length/2][x.length/2]);
		}
	}

}
