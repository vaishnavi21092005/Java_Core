class Demo{
	public static void main(String []args){
		int attendence=39;
		if(attendence>=80){
			System.out.println("5marks");
		}
		else if(attendence>=70){
			System.out.println("4marks");
		}
		else if(attendence>=60){
			System.out.println("3marks");
		}
		else if(attendence>=50){
			System.out.println("2marks");
		}
		else if(attendence>=40){
			System.out.println("1marks");
		}
		else{
			System.out.println("defaulter");
		}
	}
}