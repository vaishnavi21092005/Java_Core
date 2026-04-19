class Demo{
	public static void main(String []args){
		int a=5;
		int b=6;
		int c=a++ + b++;
		System.out.println(a);//6
		System.out.println(b);//7
		System.out.println(c);//11
	}
}