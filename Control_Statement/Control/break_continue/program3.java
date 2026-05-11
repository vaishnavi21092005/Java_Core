class prime{
	public static void main(String []args){
		int num=3;
		int count=0;
		boolean isprime=true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				isprime=false;
				break;
			}
		}

		if(isprime){
			System.out.println("Prime number");
		}
		else{
			System.out.println(" Not Prime number");
		}
	}
}
