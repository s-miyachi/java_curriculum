package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		
		//コンソールに入力
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		
		//商品名 「、」区切りで指定
		String[] names= s1.split("、");
		
		int num2 = 0;
		
		for(String name : names) {
			
			//残り台数　0~11 ランダムで出力
			Random r = new Random();
			int num = r.nextInt(11);
			
			//各商品の残り台数を出力させる
			switch(name) {
			case "パソコン":
				System.out.println(name+"の残り台数は"+num+"台です");
				System.out.println("");
				break;
				
			case "冷蔵庫":
				System.out.println(name+"の残り台数は"+num+"台です");
				System.out.println("");
				break;
			
			case "扇風機":
				System.out.println(name+"の残り台数は"+num+"台です");
				System.out.println("");	
				break;
				
			case "洗濯機":
				System.out.println(name+"の残り台数は"+num+"台です");
				System.out.println("");	
				break;
				
			case "加湿器":
				System.out.println(name+"の残り台数は"+num+"台です");
				System.out.println("");	
				break;	
				
			case "テレビ":
			case "ディスプレイ":
				
				//条件演算子を使って値を変更する
				int result = 0;
				result = name.equals("テレビ")? num:(11-num2);
				num2 = num;
				System.out.println(name+"の残り台数は"+result+"台です");
				System.out.println("");	
				
				break;
				
				/*if(name.equals("テレビ")) {
					num2 = num;
					System.out.println(name+"の残り台数は"+num+"台です");
					System.out.println("");	
				}else {
					System.out.println(name+"の残り台数は"+(11-num2)+"台です");
					System.out.println("");	
				}*/
				
			//その他の値が入力された場合の出力
			default:
				System.out.println("『"+name+"』は指定の商品ではありません");
				
			}
			sc.close();
		}
	}

}
