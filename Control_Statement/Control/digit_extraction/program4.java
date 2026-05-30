//Target count
class Demo{
	public static void main(String []args){
		int target=5;
		int num=56444;
		int count=0;
		boolean isfound=false;
		while(num>0){
			int rem=num%10;
			if(rem==target){
				count++;
			}
		num=num/10;	
		}
		System.out.println("Frequency of target number:"+count);	
	}
}

