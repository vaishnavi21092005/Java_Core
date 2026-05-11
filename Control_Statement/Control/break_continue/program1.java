class prime{
	public static void main(String []args){
		int num=4;
		int count=2;
		for(int i=2;i<num;i++){
			if(num%i!=0){
				count++;
			}
		}
		if(count==num){
			System.out.println("Prime number");
		}
		else{
			System.out.println(" Not Prime number");
		}
	}
}
			
