import java.util.*;
class AAA{
	public static String numberCount(String s){
		int count=0,temp=0;
		String st ="";
		for(int j = 0 ; j<s.length()-1;j++){
			if(s.charAt(j) != s.charAt(j+1)){
				st=st+s.charAt(j);
				}
			}
		return st;
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String []str  = {"ab","bc","cd","ad","dc","ce","ef","fh"};
		String q="";
		for(int i = 0;i<str.length-1;i++){
			if(str[i].charAt(str[i].length()-1)==str[i+1].charAt(0)){
				q=str[i]+str[i+1];
				str[i+1]=q;	
				
			}
		}
		String l = numberCount(q);
		System.out.println(l);
		System.out.println(l.length());
	}
}