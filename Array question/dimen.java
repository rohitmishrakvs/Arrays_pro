class dimen{
	public static void main(String[] args){
		int[][] arr= new int[5][5];
	 
		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr.length;j++){
				if(i%2==0){
					if(j%2==0 ){
						arr[i][j]=1;
					}
					else{
						arr[i][j]=0;
					}
				}
				else{
					if(j%2==0){arr[i][j]=0;}
					else{arr[i][j]=1;}
				}
			} 
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.print("  "+arr[i][j]);
			}
			System.out.println("");
		}
	}
}