package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
		
		
		//コンソールにユーザ名を入力できるようにする
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			String userName = scan.nextLine();
		
			//１０文字より大きい場合「名前を１０文字以内にしてください」と出力
			if(userName.length() >= 10 ) {
				 System.out.println("「名前を10文字以内にしてください」");
				 System.out.println("");
			
			//半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力
			}else if(userName.matches("[^0-9a-zA-Zア-ン]+")){
				 System.out.println("「半角英数字のみで名前を入力してください」");
				 System.out.println("");
				 
			//0文字以下もしくはnullの場合「名前を入力してください」と出力 
				 
			} else if(userName.length() <= 0 || userName == null) {
				 System.out.println("「名前を入力してください」");
				 System.out.println("");
				
			//正常な値だった場合「ユーザ名「入力したユーザー名」を登録しました」と出力
			} else {
				 System.out.println("ユーザー名"+"「"+userName+"」"+"登録しました");
				 System.out.println("");
			
				int count = 0;
				
				do {
					
					String[] janken = {"グー","チョキ","パー"};
					
					Random r = new Random();
					int user = r.nextInt(3);
					int pc = r.nextInt(3);
					
					String pc1 = "相手";
					
					System.out.println(userName+"の手は"+janken[user]);
					System.out.println(pc1+"の手は"+janken[pc]);
					System.out.println("");
					
					
					//グーに負けた場合の出力
					if (user == 1 && pc == 0) {
						
						System.out.println("俺の勝ち！");
						System.out.println("負けは次につながるチャンスです！");
						System.out.println("ネバーギブアップ！");
						System.out.println("");
						
						count++;
						
					//チョキに負けた場合の出力	
					}else if (user == 2 && pc == 1) {
						
						System.out.println("俺の勝ち！");
						System.out.println("たかがじゃんけん、そう思ってないですか？");
						System.out.println("それやったら次も、俺が勝ちますよ");
						System.out.println("");
						
						count++;
					
					//パーに負けた場合の出力
					}else if (user == 0 && pc == 2) {
						
						System.out.println("俺の勝ち！");
						System.out.println("なんで負けたか、明日まで考えといてください。");
						System.out.println("そしたら何かが見えてくるはずです");
						System.out.println("");
						
						count++;
					
					//あいこの場合の出力	
					}else if (user == pc){
						
						System.out.println("DRAW あいこ　もう一回しましょう！");
						System.out.println("");
						
						count++;
					
					//じゃんけんに勝った場合の出力	
					}else {
						
						System.out.println("やるやん！");
						System.out.println("次は俺にリベンジさせて");
						
						
						count++;
						break;
					}
				
				}while(true);
				
				//じゃんけんを行った回数を表示
				System.out.println("勝つまでにかかった回数は"+count+"回です");
				
			
			}
			scan.close();
		}
	}
	
}
			 			 
						 
				 
			 
	




