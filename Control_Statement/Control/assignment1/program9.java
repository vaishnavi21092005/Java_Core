//5 5 5 5 5
//5 4 4 4 5
//5 4 3 4 5
//5 4 4 4 5
//5 5 5 5 5



class Demo{
	public static void main(String []args){
		int row=5;
		int col=5;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==1 || j==1 || i==row || j==col){
					System.out.print(5);
				}else{
					System.out.print(4);
				}
			}
			System.out.println();
		}
	}
}
			
