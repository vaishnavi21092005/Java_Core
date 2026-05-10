class Demo{
	public static void main(String []args){
	int count=0;
	int count1=0;
	for(int b=1;b<=10;b++){
		if(b%2==0){
		count++;
		}
		else{
			count1++;
		}
	
	}
	System.out.println("count of even:"+count);
	System.out.println("count of odd:"+count1);
  }
}