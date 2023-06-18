package skJava.lesson10;

public class Sample01 {

	public static void main(String[] args) {

		// 抽象クラスの配列を作成
		Vehicle[] vc = new Vehicle[2];

		vc[0] = new Car(1234, 20.5);
		vc[0].speed = 60;

		System.out.println("-------------------------------");

		vc[1] = new Plane(232);
		vc[1].speed = 500;

		System.out.println("-------------------------------");

		for (int i = 0; i < vc.length; i++) {
			vc[i].show();
			System.out.println("-------------------------------");
		}
	}
}
