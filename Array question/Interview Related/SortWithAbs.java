import java.util.*;
import java.lang.Math;
class SortWithAbs{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int []arr = new int[size];
		int temp =0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i = 0 ;i < arr.length-1 ; i++){
			for(int j = 0;j<arr.length-1;j++ ){
				if(Math.abs(arr[j])>Math.abs(arr[j+1])){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}