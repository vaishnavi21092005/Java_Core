//first 100=5ru/unit
//next 100=7ru/unit
//next 100=10ru/unit
//Calculate toatal  electricity-bill
class Demo{
	public static void main(String []args){
		int unit = 110;
		int bill1=500+((unit-100)*7);
		int bill2=500+((unit-100)*7)+((unit-200)*10);
		if(unit<=100){
			System.out.println(unit*5);
		}
		else if(unit<=200){
			System.out.println(bill1);
		}
		else{
			System.out.println(bill2);

		}
		
	}
}

 