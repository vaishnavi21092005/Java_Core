//palindrome number
class Demo{
	public static void main(String []args){
		int num=5991;
		int reverse=0;
		int num1=num;
		while(num1>0){
			int rem=num1%10;
			reverse=reverse*10+rem;
			num1=num1/10;	
		}
		if(reverse==num){
			System.out.println("Given Number is Palindrome.");
		}else{
			System.out.println("Given Number is not Palindrome.");
		}
	}
}
