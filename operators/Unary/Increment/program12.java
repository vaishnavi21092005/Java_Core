class Demo{
	public static void main(String []args){
		int a=7;
		int b= a++ + a++ + a++;
		System.out.println(a);//10
		System.out.println(b);// 7 + 8 + 9 = 24
		
	}
}