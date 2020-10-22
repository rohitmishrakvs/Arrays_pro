import java.util.*;
class TimeFind {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0 ; i < T ; i++){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int []arr = new int[N];
			for(int j = 0 ; j < N ; j++){arr[j]=sc.nextInt();}
            int count =0;
            Arrays.sort(arr);
            for(int j=0;j<N;j++){
                if(arr[0]<K){
                    count++;
                    arr[0]++;
                }
                else{break;}
            }
            System.out.println(count);
        }
    }
}