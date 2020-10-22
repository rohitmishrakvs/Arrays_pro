import java.util.*;
class SumPairs{
	public static void main(String[] args){
		int temp=10;
		int count=0;
		int arr[]=new int[]{2,5,1,8,3,5,9,10,7};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				//if(arr[i]==arr[j]){
				//	continue;
				//}
				if((arr[i]+arr[j])==temp){
					System.out.println("pairs are:"+arr[i]+","+arr[j]);
					count++;
				}
			}
		}
		System.out.println(count);
	}
}