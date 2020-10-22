import java.util.*;
 class Shifting {
    public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		ArrayList<Integer> AL = new ArrayList<Integer>(T);
		for(int i=0;i<T;i++){
			int N=sc.nextInt();
			int k=sc.nextInt();
			int []arr=new int[N];
			
			
			ArrayList<Integer> al = new ArrayList<Integer>(4);
			al.add(N);
			al.add(k);
			al.addAll([1,2,3,4,5]);
			AL.addAll(al);
		}
		System.out.println(AL);
		for(int i=0 ; i<AL.size();i++){
			System.out.print(AL.get(3)+" ");
		}
	}
 }
