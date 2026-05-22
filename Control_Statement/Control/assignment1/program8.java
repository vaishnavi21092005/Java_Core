//1 2 3 4 5
//1       5
//1       5
//1       5
//1 2 3 4 5

class Demo{
	public static void main(String []args){
		int row=5;
		int col=5;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				int count=5;
				if(i==1 || j==1 || i==row || j==col){
					System.out.print(j);
				}
				else{
					System.out.print(" ");
				}
			}
				System.out.println();
		}
	}
}
			
