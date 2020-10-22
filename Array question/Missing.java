import java.util.*;
class FindMissing{
	int c;
	public FindMissing(){}
	public void Sort(int[] arr){
		int temp,i,j;
		System.out.println("sorted array is:");
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}	
			}
		}
		for(i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	public void missingNo(int[] arr,int c){
		int total_sum ;
		total_sum=c*(c+1)/2;
		int sum_of_given_Array=0;
		for(int i=0;i<arr.length;i++){
			sum_of_given_Array+=arr[i];
		}
		System.out.println("sum of given array is : "+total_sum);
		System.out.println("sum of given array is : "+sum_of_given_Array);
		System.out.println("Missing No is :"+(-(sum_of_given_Array)+(total_sum)));
		}
	
}
class Missing{
	public static void main(String[] args){
		int[] arr= new int[]{1,2,3,4,6,7};
		FindMissing fm =new FindMissing();
		fm.Sort(arr);
		fm.missingNo(arr,7);
	}
}