class sumofdigit{
	public static void main(String []args){
	int num=567;
	int count=0;
	for(int b=num;b>0;b=b/10){
		count++;
		
	}
	System.out.println(count);
	for(int a=1;a<=count-1;a++){
		num=num/10;		
	}
	System.out.println(num);
	
	
   }
}