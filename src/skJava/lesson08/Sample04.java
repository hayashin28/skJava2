package skJava.lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample04 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("文字を入力して下さい：");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuffer sb = new StringBuffer(br.readLine());
		System.out.println("入力した文字は「".toString() + sb.toString() + "」です。");
		System.out.println();
		
		System.out.print("追加したい文字を入力して下さい：");
		
		String str = br.readLine();
		sb.append(str);
		
		System.out.println("追加後の文字は「" + sb + "」です。");
		
		
		
	}
}
