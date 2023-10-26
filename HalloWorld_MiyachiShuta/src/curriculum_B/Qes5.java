package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			
			for(int j = 1; j < 21; j++) {
				
				//数値を3桁表示にする formatメソッド
				String num1 = String.format("%03d",i);
				String num2 = String.format("%03d",j);
				String num3 = String.format("%03d",(i * j));
				//式を出力
				System.out.print(num2 + " * " + num1 + " = " + num3 + " || ");
				
			}
			//改行を出力
			System.out.println("");
		}

	}

}
