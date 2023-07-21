package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		//Qes1 変数宣言のみ
		// バイト型
		byte b;
		// 短整数型
		short s;
		// 整数型
		int i;
		// 長整数型
		long l;
		// 単精度浮動小数点数型
		float f;
		// 倍精度浮動小数点数型
		double d;
		// 文字型
		char ch;
		// 文字列型
		String St; 
		// ブーリアン型
		boolean data;
		
		//Qes2 初期値を代入
		b = 0;
		s = 0;
		i = 0;
		l = 0L;
		f = 0.0f;
		d = 0.0d;
		ch = '\u0000';
		St = null;
		data = false;
		
		//Qes3 初期化した変数に代入
		b = 10;
		s = 100;
		i = 1000;
		l = 10000L;
		f = 9.5f;
		d = 10.5d;
		ch = 'a';
		St = "ハロー";
		data = true;
		
		
		//Qes4
		//11110
		System.out.println(b+s+i+l);
		//20
		System.out.println(b*2);
		//a ハロー　true
		System.out.println(ch + St + data );
		//11130 すべての数字を足す
		System.out.println(b+s+i+l+f+d);
		//小数点以外の数字をすべてかける
		System.out.println(b*s*i*l);
		//10.5割る100をする
		System.out.println(d/s);
		//10引く100をする
		System.out.println(b-s);
		
		//Qes5
		System.out.println("");
		int num=20;
		int num1=23;
		//結果を出力
		System.out.println("ハローJAVA"+(num+num1));
		
		//Qes6
		//『山田太郎 18歳 170.5cm 62.2kg 寿司』
		System.out.println("");
		String name = "山田太郎";
		int age = 18;
		double height =170.5;
		double weight =62.2;
		String food ="寿司";
		//結果を出力
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		
		//Qes7
		System.out.println("");
		double bmi=weight/((height/100)*(height/100));
		//結果を出力
		System.out.println("ＢＭＩは"+(Math.floor(bmi*10)/10)+"です");
		
		//Qes8
		System.out.println("");
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		bmi = weight/((height/100)*(height/100));
		//結果を出力
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		System.out.println("ＢＭＩは"+(Math.floor(bmi*10)/10)+"です");
		
		//Qes9
		System.out.println("");
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+(age*2)+"歳です");
		System.out.println("身長は"+(height*2)+"cmです");
		System.out.println("体重は"+(weight*2)+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		System.out.println("ＢＭＩは"+(Math.ceil(bmi*100)/100/2)+"です");
		
		//Qes10 25歳以上ならtrueを出力
		System.out.println("");
		System.out.println(age >= 25);
		
		//Qes11 年齢・身長・体重を文字列型に型変換
		System.out.println("");
		
		//年齢　整数型→文字列型に変換
		String str1 = String.valueOf(age);
		//身長　少数点型→文字列型に変換
		String str2 = String.valueOf(height);
		//体重　小数点型→文字列型に変換
		String str3 = String.valueOf(weight);
		
		//年齢・身長・体重　結果を繋げて出力
		System.out.println(str1+str2+str3);
		
		//Qes12　11で変換した年齢・身長を整数型に変換
		System.out.println("");
		//年齢　文字列型→整数型に変換
		age = Integer.parseInt(str1);
		//結果を出力
		System.out.println("年齢は"+age+"歳です");
		
		//体重　文字列型→整数型に変換 /*キャストする必要がある！*/
		height = (int)Double.parseDouble(str2);
		//結果を出力
		System.out.println("身長は"+height+"cmです");
		
		//Qes13 「年齢が25もしくは身長が160以上」であればtrueを出力
		System.out.println("");
		boolean result;
		result = (age == 25) || ( height >=160);
		//結果を出力
		System.out.println(result);
	}
}

