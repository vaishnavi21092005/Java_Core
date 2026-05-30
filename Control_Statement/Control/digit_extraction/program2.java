//Spy Number
class Demo{
	public static void main(String []args){
		int rem=0;
		int num=324;
		int sum=0;
		int fact=1;
		while(num>0){
			rem=num%10;
			sum=sum+rem;
			fact=fact*rem;
			num=num/10;
		}
		if(sum==fact){
			System.out.println("Spy Number");
		}else{
			System.out.println(" Not Spy Number");
		}
	}
}

