import java.util.*;
class MatrixRotation{
	
	static void printSubMatrix(int[][] matrix , int m) {
		Scanner sc = new Scanner(System.in);
		int rows = matrix.length, cols = matrix[0].length;
		int r = sc.nextInt();
		int s=sc.nextInt();
	// Swap Rows with corresponding columns
	// i.e. rotate matrix about the axis passing through i = j diagonal.
		for(int i = 0; i < rows; i++) {
			for(int j = i; j < cols; j++) { 
				if(i>=r && j>=s){			
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
				}
			}
		}
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println("  ");
		}
		System.out.println("###########################3");
		//*************************************************************************
		
			for(int j=r,k=rows-1;j<rows;k--,j++){
				for(int i = s ;i<cols;i++){
				if(j>=k){break;}
				int temp= matrix[j][i];
				matrix[j][i]=matrix[k][i];
				matrix[k][i]=temp;
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
		printSubMatrix(mat,m);
	}

}