import java.util.*;
class FrequencyOfElement{
	public static void main(String[] args){
		int arr[]=new int[]{1,1,1,1,2,2,3,4,5,6,7,7,7,8,9,9,9,9,};
		int count=1;
		int temp=count;
		for(int i=0 ;i <arr.length;i++){
			if(arr[i]==arr[i+1]){
				temp=count+1;
			}
			if(arr[i]!=arr[i+1]){
				System.out.println("The frequency of the NO."+arr[i] +"is :"+temp);
				count=0;
			}
			
		}
		 
	}
}