package curriculum_1_18;

import java.util.Random;

public class curriculum_New_1_18 {
	
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

	public static void methodA(String st , String st2 , int num) {
	
		System.out.println(st + " " + st2 + " " + num);
		System.out.println("");
		
	}
	
	// Q2:引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	
	public static void methodB(int x , int y) {
		
		System.out.println(x * y);
		System.out.println("");
		
	}
	
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	
	public static void methodC(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.println(array[i]);
			
		}
		System.out.println("");
	}
	
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	
	public static void methodB(double x , double y) {
		
		System.out.println(x + y);
		System.out.println("");
	}
	
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	
	public static int[] Array(int num) {
		
		int [] intArray = new Random().ints(num,0,100).toArray();
		
		for(int i = 0; i < num; i++) {
			
			System.out.println(intArray[i]);
			
		}
		System.out.println("");
		return intArray;
	}
	
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	
	public static double arrayAvg(int[] avg) {
		
		double Avg = 0.0d;
		double sum = 0.0d;
		
		for(int total : avg) {
			
			sum += total;
			
		}
		
		Avg = sum/avg.length;
		
		System.out.println(Avg);
		System.out.println("");
		
		return Avg;
		
	}
	
	// 	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	public static boolean getAvg(double avg) {
		
		double a = avg;
		
		if(50 <= a) {
			
			return true;
			
			
		}else {
			
			return false;
			
		}
		
		
	}
	
	
	// -----メイン----- //
	public static void main(String[] args) {
		
	// Q1
		methodA ("Hello" , "JavaSE" , 11);
		
	// Q2
		methodB (10 , 20);
	
	// Q3
		
		int[] array = {10,20,30,40,50};
		methodC(array);
	
	// Q4
		methodB (10.5 , 20.5);
		
	// Q5
		int[] a = Array(5);
		
	// Q6
		double avg = arrayAvg(a);
		
	// Q7
		
		if(getAvg(avg)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}

}
