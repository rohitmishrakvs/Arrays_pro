import java.util.*;
import java.lang.*;
class Consecutive{
	public static void main(String [] args){
		int count=0,ans=0;
		int arr[]= new int[]{2,3,4,5,7, 9, 10};
		for(int i=0;i<arr.length-1;i++){
			if((arr[i+1]-arr[i])==1){
				count++;
			}
			else{
				count=1;
			}
			if(ans<count){ans=count;}
		}
			System.out.println("****"+ans);
		
	}
}