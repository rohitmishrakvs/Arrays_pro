import java.util.*;
class Replace{
	public Replace(){}
	public void INplaceReplacment(int arr[]){
		//int newarr[] =new int[arr.length];
		//arr[0]=newarr;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					arr[j]=0;
				}
			}
		}
		for(int i=0 ;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
class InplaceDuplicate{
	public static void main(String[] args){
		int arr[] = new int[]{1,1,1,1,1,1,1,2,2,2,2,2,3,3,3,3,3};
		Replace r=new Replace();
		r.INplaceReplacment(arr);
		
	}
}