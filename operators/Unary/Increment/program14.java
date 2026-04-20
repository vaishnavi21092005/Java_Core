class Demo1{
	public static void main(String[]args){
		int a=5;
		int b=7;
		boolean c=++a<++b && ++a>++b;
		System.out.println(a);//7
		System.out.println(b);//9
		System.out.println(c);//f
	}
}