//*   *
// * *
//  *
// * *
//*   *
class Demo{
	public static void main(String []args){
		int row=6;
		int col=6;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
				if(i==j || i+j==row){
					System.out.print("*");
				}else{
					System.out.print("-");
				}
			}

			System.out.println();
		}
	}
}