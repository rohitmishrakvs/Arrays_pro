import java.util.*;
class SubArray{
	public static void main(String[] args){
		int[] arr=new int[]{3,2,5,6};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				for(int k=0;k<j;k++);
				{
					System.out.print(" "+arr[j]);
				}
				
			}System.out.print("");
		}
	}
}