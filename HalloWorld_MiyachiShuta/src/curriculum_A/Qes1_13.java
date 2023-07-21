package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		//Qes1_3
		// バイト型
		byte b = 0;
		b = 10;
		
		// 短整数型
		short s = 0;
		s = 100;
		
		// 整数型
		int i = 0;
		i = 1000;
		
		// 長整数型
		long l = 0;
		l = 10000;
		
		// 単精度浮動小数点数型
		float f = 0.0f;
		f = 9.5f;
		
		// 倍精度浮動小数点数型
		double d = 0.0d;
		d = 10.5d;
		
		// 文字型
		char ch = '\u0000';
		ch = 'a';
		
		// 文字列型
		String St = null; 
		St = "ハロー";
		
		// ブーリアン型
		boolean data = false ;
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
		System.out.println("ハローJAVA"+(num+num1));
		
		//Qes6
		//『山田太郎 18歳 170.5cm 62.2kg 寿司』
		System.out.println("");
		String name = "山田太郎";
		int age = 18;
		float height =170.5f;
		float weight =62.2f;
		String food ="寿司";
		//format
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		
		//Qes7
		System.out.println("");
		double bmi=weight/((height/100)*(height/100));
		System.out.println("ＢＭＩは"+(Math.floor(bmi*10)/10)+"です");
		
		//Qes8
		System.out.println("");
		name = "鈴木一郎";
		age = 24;
		height = 168.5f;
		weight = 64.2f;
		food = "オムライス";
		bmi = weight/((height/100)*(height/100));
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
		System.out.println(age>=25); //false
		
		//Qes11 年齢・身長。体重を文字列型に型変換
		System.out.println("");
		String ageS = String.valueOf(age);
		String floath = String.valueOf(height);
		String floatw = String.valueOf(weight);
		System.out.println(ageS+floath+floatw);
		
		//Qes12 11で変換した年齢・身長を整数型に変換
		System.out.println("");
		age = Integer.parseInt(ageS);
		height = Float.parseFloat(floath);
		System.out.println(ageS+floath);
		
		//Qes13 「年齢が25もしくは身長が160以上」であればtrueを出力
		System.out.println("");
		System.out.println(age>=25 || height >= 160);
	}
}

