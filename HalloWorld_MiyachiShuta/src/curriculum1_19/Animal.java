package curriculum1_19;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
	// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		
		Dog d = new Dog() ;
		
		d.dog();
		System.out.println(d.animalName);
		
	// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		
		d.dogNum(3);
		System.out.println(d.animalNum);
		
	
	// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		
		LocalDateTime date = LocalDateTime.now();
		DateTimeFormatter dtformat = 
				DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		
		String fmtDate = dtformat.format(date); 
		
		System.out.println(fmtDate);
		
	}

}
