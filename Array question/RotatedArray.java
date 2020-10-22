/*import java.util.*;
class rotateE{
	int l,r,num;
	public int search(int []arr,int l,int r,int num){
			if(l > r){return -1;}
			int mid = (l+(r))/2;
			if(arr[l] == num){return mid;}
			if(arr[l] < arr[mid]){
				if(num > arr[l] && num<=arr[mid]){return search(arr,l,mid,num);}
			return search(arr,mid+1,r,num);
			}
			if(arr[l] > arr[mid]&& num<=arr[r]){return search(arr,mid+1,r,num);}
			return search(arr,l,mid-1,num);
		
	}

}
class RotatedArray{
	public static void main(String[] args){
		int a ,k;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		int arr[] = new int[]{4,5,6,7,8,9,0,1,2,3};
		int start=0;
		int end=arr.length-1;	
		 rotateE rr = new rotateE();
		
		k=rr.search(arr,start,end,a);
		if(k!=-1){
		System.out.println("the number found at :"+k );
		}
		else{System.out.println("Not found");}
 	}
}*/