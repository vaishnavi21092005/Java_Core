class Demo{
	public static void main(String []args){
		int rem=0;
		int num=1234;
		while(num>0){
			rem=num%10;
			System.out.println(rem);
			num=num/10;
		}
	}
}

