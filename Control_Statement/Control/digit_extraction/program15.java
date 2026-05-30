//Harshad Number
//num=18
//1+8=9
//18%9==0
class Demo{
	public static void main(String []args){
		int num=11;
		int a=num;
		int sum=0;
		while(num>0){
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(a%sum==0){
			System.out.println("Harshad Number");
		}else{
			System.out.println("Not Harshad Number");
		}
	}
}
