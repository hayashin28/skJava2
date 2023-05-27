package skJava.lesson09;

// レーシングカー
public class RacingCar extends Car {
	
	private int course; // コース
	
	
	
	public RacingCar() {
//		super();
		course = 0;
		System.out.println("レーシングカーを作成しました。");
	}
	
	public RacingCar(int n, double g, int c) {
		super(n, g);
		course = c;
		System.out.println("コース番号" + course + "のレーシングカーを作成しました。");
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("コースを" + course + "にしました。");
	}
	
	@Override
	public void show() {
		System.out.println("レーシングカーのナンバーは" + num);
		System.out.println("ガソリン量は" + gas);
		System.out.println("コースは" + course);
	}

}
