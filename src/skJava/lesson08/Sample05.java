package skJava.lesson08;

public class Sample05 {
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.Show();
		
		int number = 1234;
		double gasoline = 20.5;
		String str = "1号車";
		
		car1.setCar(number, gasoline);
		car1.setName(str);
		
		System.out.println("------------------------------------");
		
		Num(number);
		car1.setCar(number, gasoline);

		Name(car1);

		System.out.println();
		
		car1.Show();
	}
	
	public static void Num(int num) {
		num = 5678;
	}

	public static void Name(Car car) {
		car.setName("2号車");
	}
	
}
