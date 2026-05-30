class Demo{
	public static void main(String []args){
		int sub=0;
		int max=0;
		int num=89;
		int a=num;
		int count=0;
		int b=0;
		while(num>0){
			max=0;
			while(num>0){
				int rem=num%10;
				num=num/10;
			
			if(rem>max){
				max=rem;
				}
			}
			sub=a-max;
			System.out.println(sub);
			if(sub>0){
				num=sub;
				
				
			}
			a=num;
			count++;
		}
			
		System.out.print(count);
	}
}
		