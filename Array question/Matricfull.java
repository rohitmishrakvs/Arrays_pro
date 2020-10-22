import java.util.*;
class Matricfull{
	public static void rotate(int[][] matrix) {
    
    int rows = matrix.length, cols = matrix[0].length;
    
	// Swap Rows with corresponding columns
	// i.e. rotate matrix about the axis passing through i = j diagonal.
    for(int i = 0; i < rows; i++) {
        for(int j = i; j < cols; j++) {        
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			System.out.print(matrix[i][j]+" ");
		}
		System.out.println("  ");
	}
    
	// Swap Row(i) with Row(cols - i - 1)
	// i.e. rotate matrix about the y axis passing through center
    for(int i = 0; i < cols/2; i++) {
        for(int j = 0; j < rows; j++) {
            int temp = matrix[j][i];
            matrix[j][i] = matrix[j][cols-i-1];
            matrix[j][cols-i-1] = temp;
        }            
    }
	for(int i=0;i<rows;i++){
		for(int j=0;j<cols;j++){
			System.out.print(matrix[i][j]+" ");
		}
		System.out.println("  ");
	}
}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int [][]mat=new int[m][m];
		for(int i=0;i<m;i++){
			for(int j=0;j<m;j++){
				mat[i][j]=sc.nextInt();
			}
		}
		rotate(mat);
	}

}