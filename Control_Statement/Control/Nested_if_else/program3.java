class Demo{
	public static void main(String []args){
		int marks=0;
		if(marks<=100 && marks>=75)
			System.out.println("A");
		if(marks>=60 && marks<75)
			System.out.println("B");
		if(marks>=35 && marks<60)
			System.out.println("C");
		if(marks<35)
			System.out.println("Fail");
		if(marks>100 && marks>0)
			System.out.println("Invalid");
		
	}
}