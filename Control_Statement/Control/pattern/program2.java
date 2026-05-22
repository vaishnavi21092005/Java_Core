class Demo{
	public static void main(String []args){
		int i=1;
		int j=1;
		int b=4;
		for(i=1;i<=4;i++){
			for(j=1;j<=4;j++){
			if(i+j<=b){
			System.out.print("=");
			}
			else{
			System.out.print("*");
			}
		}
		System.out.println();
		}

	}
}


		