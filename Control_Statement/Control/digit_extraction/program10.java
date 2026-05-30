//Minimum Number
class Demo{
	public static void main(String []args){
		int num=87254;
		int num1=num;
		int max=0;
		while(num>0){
			int rem=num%10;
			if(max<rem){
				max=rem;
			}
			num=num/10;
		}
		int min=max;
		while(num1>0){
			int rem=num1%10;
			if(min>rem){
				min=rem;
			}
			num1=num1/10;
		}
		System.out.println(min);
	}
}