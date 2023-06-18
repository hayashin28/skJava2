package skJava.lesson10;

public interface Test extends iVehicle, iMaterial {

}

class Hoge implements Test {

	@Override
	public void vShow() {
		// TODO Auto-generated method stub
	}

	@Override
	public void mShow() {
		// TODO Auto-generated method stub
	}
}

class HogeHoge extends Hoge {

	@Override
	public void mShow() {
	}

}