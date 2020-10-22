import java.util.*;
class DUplicateNum{
	public static void main(String[] args){
		int arr[] = new int[]{1,2,3,3,4,3,5,7,5,9,9,9,9,9,10,23,23,23,23,23};
		/*int arr[] new int[a1.length];
		 for(int i : a1){
			 arr[i]=1;
		 }*/
		 Arrays.sort(arr);
		 System.out.println("%s:"+Arrays.toString(arr));
		 for(int i=0 ; i<arr.length-1;i++){
			if(arr[i]==arr[i+1]){
				if(arr[i+1]==arr[i-1]){
					continue;
				 }
				else{
					System.out.println(arr[i+1]);
				 }
				} 
			}
		}
	}