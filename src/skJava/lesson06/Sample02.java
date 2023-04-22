package skJava.lesson06;

public class Sample02 {

	public static void main(String[] args) {
		
		Car car1;
		Car car2;
		
		// インスタンス化
		car1 = new Car();
		car2 = new Car();
		
		// フィールドに値を設定
		car1.num = 1185;
		car1.gas = 1.6;
		car2.num = 1192;
		car2.gas = 65.3;
		
		System.out.println("車両Noは" + car1.num + "です。");
		System.out.println("ガソリン量は" + car1.gas + "です。");
		System.out.println();
		System.out.println("車両Noは" + car2.num + "です。");
		System.out.println("ガソリン量は" + car2.gas + "です。");
	}
}
