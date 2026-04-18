class Demo{
	public static void main(String []args){
		int a=10;
		int b=20;
		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping");
		System.out.println(a);
		System.out.println(b);
	}
}
//Swapping c is variable used for store the value of a.
//c is temporary variable