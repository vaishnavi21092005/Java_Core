class Demo{
	public ststic void main(String []args){
		int a=10;
		System.out.println(a);
		Demo.fun();
	}
	static void fun(){
		System.out.println(a);
	}
}
//Error: Identifier Excepted
