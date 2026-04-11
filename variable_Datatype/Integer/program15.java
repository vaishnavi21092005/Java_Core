class Demo{
	public static void main(String []args);
		int a=10;
		System.out.println(a);
		Demo.fun();
	}
	static void fun(){
		System.out.println(a);
	}
}
//program15.java:4: error: <identifier> expected
                System.out.println(a);
                                  ^
program15.java:4: error: <identifier> expected
                System.out.println(a);
                                    ^
program15.java:6: error: class, interface, enum, or record expected
        static void fun(){
               ^
program15.java:8: error: class, interface, enum, or record expected
        }
