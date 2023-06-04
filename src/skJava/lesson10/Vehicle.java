package skJava.lesson10;

// 乗り物クラス
public abstract class Vehicle {

	protected int speed;
	
	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("速度を" + speed + "にしました。");
	}
	abstract void show();
}
