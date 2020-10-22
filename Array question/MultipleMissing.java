import java.util.*;
class MultipleMissing{
	public static void main(String[] args){
		boolean isfound=true;
		BitSet bs = new BitSet();
		int arr[]=new int[]{1,2,4,5,6,7,9,12,14,17};
		
		for(int i =0 ; i<arr.length ;i++){
			bs.set(arr[i]);	
		}
		
		for(int i =0 ; i<arr.length ;i++){
			System.out.println("arr is :"+arr[i]);
		}
		
		System.out.println("BiteSet is  :"+ bs);
		
		
		for(int i= 1 ;i<bs.length();i++){
				//System.out.println("Missing numbers are:"+bs.previousClearBit(9));
				
				if(bs.nextClearBit(i)==bs.nextClearBit(i+1)){
					 continue;
				}
				System.out.println("Missing numbers are:"+bs.nextClearBit(i));
			}
			
			
		
		/*int arr[]={1,2,4,6,6,7,7,8,9,1};
		int arr2[]=new int[arr.length];
		for(int i: arr){
		arr2[i]=1;
		}
		System.out.println("Missing numbers are");
		for(int i=1;i<arr2.length;i++){
			if(arr2[i]==0){
				System.out.println(i);
			}
		}*/
	}
}