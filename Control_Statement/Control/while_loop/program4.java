class Demo2{
	public static void main(String []args){
		int i=2;
		int num=6;
		boolean isprime=true;
		while(i<num){
			if(num%i==0){
				isprime=false;
				break;
			}i++;
		}
		if(isprime){
			System.out.println("Prime Number");
		}else{
			System.out.println(" Not Prime Number");
		}

	}
}