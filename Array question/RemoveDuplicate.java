import java.util.*;
class Remove{
	public Remove(){}
	public void RemoveDup(int[] arr){	
	Arrays.sort(arr);	
		for(int i= 0 ; i < arr.length ; i++){
			if(arr[i]==arr[i+1]){
					continue;
			}
			System.out.println(arr[i]);
		}  
	}
}
class RemoveDuplicate{
	public static void main(String[] args){
		int arr[] = new int[]{1,2,3,4,5,6,4,3,2,7,7,8,8,8,8,8,8,8,8,8,88,8,8};
		int n = arr.length;
		Remove rr=new Remove();
		rr.RemoveDup(arr);
	}
}
