//Strong Number 145=
//1 fact=1
//4 fact=24
//5 fact=120
class Demo{
	public static void main(String []args){
		int num=145;
		int original=num;
		int fact=1;
		int sum=0;
		while(num>0){
			int rem=num%10;
			num=num/10;
			for(int i=1;i<=rem;i++){
				fact=fact*i;
			}
			sum=sum+fact;
			fact=1;
			
		}
		System.out.println(sum);
		if(original==sum){
			System.out.println("Strong Number");
		}else{
			System.out.println("Not Strong NUmber");
		}
	}
}
		
