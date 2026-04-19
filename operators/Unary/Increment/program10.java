class Demo{
	public static void main(String []args){
		int a=5;
		int b=3;
		int c=a++ + b++ + ++a;
		System.out.println(a);//7
		System.out.println(b);//4
		System.out.println(c);// 5 + 3 + 7 =15
	}
}