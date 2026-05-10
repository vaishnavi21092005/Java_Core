class sumofdigit{
	public static void main(String []args){
	int num=12344;
	int count=0;
	for(int b=num;b>0;b=b/10){
		count++;
		
	}
	System.out.println("----------------------");
	System.out.println(count);
	
   }
}