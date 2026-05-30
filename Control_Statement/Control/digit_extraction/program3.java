//Target found
class Demo{
	public static void main(String []args){
		int target=4;
		int num=567;
		boolean isfound=false;
		while(num>0){
			int rem=num%10;
			if(rem==target){
				isfound=true;
			}
		num=num/10;	
		}
		if(isfound){
			System.out.println("Number is found");
		}else{
			System.out.println("Number is not found");
		}
	}
}

