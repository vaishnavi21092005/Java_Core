//Duck Number
class Demo{
	public static void main(String []args){
		int num=50444;
		boolean isduck=false;
		while(num>0){
			int rem=num%10;
			if(rem==0){
				isduck=true;
				break;
			}
		num=num/10;	
		}
		if(isduck){
			System.out.println("Number is Duck");
		}else{
			System.out.println("Number is not Duck");		
		}
	}
}

