//i/p=1234
//o/p=1
//2
//3
//4
class Demo{
	public static void main(String []args){
		int num=1234;
		int rev=0;
		while(num>0){
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		while(rev>0){
			int rem1=rev%10;
			System.out.println(rem1);
			rev=rev/10;
		}
	}
}

