import java.util.*;
class RowMatrixDuplication{
	public static void main(String []args){
		int [][]arr = new int[][]{{2 ,5 ,7 ,9 ,14 ,16},
								  {3 ,6 ,8 ,10 ,15 ,21},
								  {4 ,7 ,9 ,15 ,22 ,35},
								  {7 ,8 ,9 ,22 ,40 ,58}
								  };
		int k=0;
		int []arr1 = new int[4*6];
		ArrayList<Integer> al = new ArrayList<Integer>(24);
		for(int i=0; i < 4 ; i++){
			for(int j=0 ; j < 6 ; j++ ){
				arr1[k]=arr[i][j];
				k++;
				//System.out.println(arr[i][j]);
			}
		}	
		Arrays.sort(arr1);
		for(int i=0;i<arr1.length-1;i++){
			if(arr1[i]!=arr1[i+1]){
				al.add(arr1[i]);
			}
			System.out.print(arr1[i]);
		}
		for(int i=0;i<al.size();i++){
			System.out.print(" "+al.get(i)+" ");
		}
		
		 
	}
}