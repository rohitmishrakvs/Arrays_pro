import java.util.*;
class UNsortedArySearch{
	public static void main(String[] args){
		
		int arr[]=new int[]{4,11,5,7,9,3,2,10};
		int temp=arr[0],rep=arr[0];
		for(int i=0;i<arr.length;i++){
			if(temp>arr[i]){
				temp=arr[i];
			}
			if(rep<arr[i]){
				rep=arr[i];
			}			
		} 
		System.out.println("smallest no in unsoretd  array is :"+temp);
		System.out.println("Largest number in unsorted array is:"+rep);
	}
}