import java.util.*;
/*class Reverse{
	public Reverse(){}
	public  void ReverseAA(int arr[],int n){
		int aj[]=new int[n];
		int i=n;
		for(int j=0;j<n;j++){
			aj[i-1]=arr[j];
			i=i-1;
		}
		for(int k=0;k<n;k++){
			System.out.println(aj[k]);
		}
	}
}*/
class ReverseArray{
	public static void main(String[] args){
		int arr[] = new int[]{2,4,5,6,7,8};
		int n= arr.length;
		int temp=0;
		int j=n-1;
		for(int i=0 ; i<n/2;i++){
			temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
		}
		for(int i =0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		//Reverse r= new Reverse();
		//r.ReverseAA(arr,6);
	}
}