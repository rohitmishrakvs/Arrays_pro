import java.util.*;
 
class BinaryNo{
	public void printUnrepeated(int row , int col , int arr[][]){
		HashSet<String> set =new HashSet<String>();
		
		for(int i = 0 ;i < row ; i++){
			String s = "";
			for(int j = 0 ; j < col ; j++){
				s=s+String.valueOf(arr[i][j]);
			}
			if(!set.contains(s)){
				set.add(s);
				System.out.println(s);
			}
		}

	}
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int row =sc.nextInt();
	int col = sc.nextInt();
	int [][]arr=new int[row][col];
	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
			arr[i][j]=sc.nextInt();
			}
		}
	 
	BinaryNo b = new BinaryNo();
	b.printUnrepeated(row,col,arr);
	}
	
}