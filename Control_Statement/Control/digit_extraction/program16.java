//Happy Number
//19
//1's square+9's square=1+81=82
//64+4=68
//36+64=100
//1+0+0=1
class Demo{
	public static void main(String []args){
		int num=20;
		int sum=0;
		int sq=0;
		while(num!=1 && num!=4){
			sum=0;
			while(num>0){
				int rem=num%10;
				sq=rem*rem;
				sum=sum+sq;
				num=num/10;
			}
			num=sum;
		}
		if(num==1){
			System.out.println("Happy Number");
		}else{
			System.out.println("Not Happy Number");
		}
	}
}
			