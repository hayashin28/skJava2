package skJava.lesson10;

// 飛行機クラス
public class Plane extends Vehicle {

	private int flight;

	public Plane(int flight) {
		this.flight = flight;
		System.err.println("便" + this.flight + "の飛行機を作成しました。");
	}

	@Override
	void show() {
		System.out.println("飛行機の便は" + flight + "です。");
		System.out.println("スピードは" + speed + "です。");
	}

}
