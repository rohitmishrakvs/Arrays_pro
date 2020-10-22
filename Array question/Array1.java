import java.util.*;

class New{
	public New(){}
	public void sortArray(int[] arr){
		int temp;
		for(int i=0 ;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted array is :");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
class Array1{
	public static void main(String[] args){
		int arr[] =new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element you want to sort :");
		for(int i=0;i<6;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enetered number is :");
		for(int i=0;i<6;i++){
			System.out.println(arr[i]);
		}
		New n = new New();
		n.sortArray(arr);
	}
}