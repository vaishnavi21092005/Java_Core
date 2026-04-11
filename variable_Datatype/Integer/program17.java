class Demo{
	public ststic void main(Strin []args){
		int a=10;
		System.out.println(a);
		Demo.fun();
	}
	static void fun(){
		a=20;//Can not declare
		System.out.println(a);
	}
}
Error:<Identifier>Excepted means Declaration