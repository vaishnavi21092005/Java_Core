class Demo1{
	public static void main(String []args){
		int a=5;
		int b=3;
		boolean c=a>=b || a<=b;
		boolean d=a==b || a!=b;
		boolean e= a!=b || a>=b;
		System.out.println(c);//t
		System.out.println(d);//t
		System.out.println(e);//t
		boolean f=a>b || true;
		boolean g=true || true;
		boolean h=true || false;
		boolean i=false || true;
		boolean j=false || false;
		System.out.println(f);//t
		System.out.println(g);//t
		System.out.println(h);//t
		System.out.println(i);//t
		System.out.println(j);//f
	}
}
