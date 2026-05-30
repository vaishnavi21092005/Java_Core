//Reverse Number
class Demo{
	public static void main(String []args){
		int num=56444;
		int reverse=0;
		boolean isfound=false;
		while(num>0){
			int rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;	
		}
		System.out.println("Reverse of number of given number:"+reverse);	
	}
}

