package skJava.lesson05;

public class FizzBazz {
	
	public void fizzbazz() {
		
		// 1～15までのループ
		for (int i = 1; i <= 15; i++) {
			// 現在の i の値を出力
			System.out.print(i + "：");
			// 3で割り切れたらFizz
			if (i % 3 == 0)
				System.out.print("Fizz");

			// 5で割り切れたらBazz
			if (i % 5 == 0)
				System.out.print("Bazz");
			
			// 改行
			System.out.println();
		}
	}
	
}
