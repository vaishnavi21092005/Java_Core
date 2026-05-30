class Demo2{
	public static void main(String []args){
		int i=1;
		int num=4;
		int count=0;
		while(i<=num){
			if(num%i==0){
				count++;
			}i++;
		}
		if(count==2){
			System.out.println("Prime Number");
		}else{
			System.out.println(" Not Prime Number");
		}

	}
}