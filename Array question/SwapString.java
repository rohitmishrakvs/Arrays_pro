import java.util.*;
class SwapString{
	static void Swap(char arr[],int B,int C){
		int f = B/arr.length;
		int r = B%arr.length;
		char temp;
		if(B>arr.length){
		for(int j = 0 ; j< f+r ; j++){
			for(int i=0;i<arr.length;i++){
				int n = (i+C)%(arr.length);
				temp = arr[i];
				arr[i]= arr[n];
				arr[n]=temp;
				System.out.println(arr);	
				} 
			}
		}
		else{
			for(int i=0;i<B;i++){
				int n = (i+C)%(arr.length);
				temp = arr[i];
				arr[i]= arr[n];
				arr[n]=temp;
				System.out.println(arr);	
				} 

		}
		for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		char []arr = s.toCharArray();
		Swap(arr,B,C);
	}
}