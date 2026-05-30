//maximum digit
class Demo{
	public static void main(String []args){
		int max=0;
		int num=90;
		while(num>0){
			int rem=num%10;
			if(max<rem){
				max=rem;
			}
			num=num/10;
		}
		System.out.println("Maximum Number:"+max);
	}
}