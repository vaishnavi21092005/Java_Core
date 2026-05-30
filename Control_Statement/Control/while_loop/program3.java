class Demo2{
	public static void main(String []args){
		int i=1;
		int num=6;
		int sum=0;
		while(i<num){
			if(num%i==0){
				sum=sum+i;
			}i++;
		}
		if(num==sum){
			System.out.println("Perfect Number");
		}else{
			System.out.println(" Not Perfect Number");
		}

	}
}