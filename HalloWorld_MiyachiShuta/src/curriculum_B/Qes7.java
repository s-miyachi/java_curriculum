package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
			System.out.print("生徒の人数を入力してください(２以上)：");
			
			int num = scanner.nextInt();
			
			String [] sub = {"英語","数学","理科","社会"};
			
			int score[][] = new int [num][sub.length];  
			
			
			for(int i = 0; i < score.length; i++) {
				
				for(int j = 0; j < sub.length; j++) {
					
					System.out.print((i+1)+"人目の『"+sub[j]+"』の点数を入力してください:");
					score[i][j] = scanner.nextInt();
				
				}
				System.out.println("");
			}
			scanner.close();
			
			//生徒ごとの平均点
			for(int i = 0; i < num; i++) {
				
				double sum = 0.0d;
				
				for(int j = 0; j < sub.length; j++) {
					
					sum += score[i][j] ;
					
				}
				
				double ave = (sum / sub.length);
				
				System.out.println((i+1) + "人目の平均点は" + String.format("%.2f", ave) + "点です。");
				
			}
			
			System.out.println("");
			
			//各科目の平均点
			for(int j = 0; j < 4; j++) {
				
				int sum = 0;
				
				for(int i = 0; i < num ; i++) {
					
					sum += score[i][j];
					
				}
				
				double ave = ((double) sum / num);
				
				System.out.println(sub[j] + "の平均点は" + String.format("%.2f", ave) + "点です。");
			}
			
			//全体の平均点
			
			int all = 0;
			double ave = 0.0d;
			int n =0;
			
			for(int i = 0; i < score.length; i++) {
				
				int sum = 0;
				
				for(int j = 0; j < sub.length; j++) {
					
					sum += score[i][j];
					n += i;
					
				}
				
				all += sum ;
				
				ave = ((double)all / n);
			}
			System.out.println("全体の平均点は" + String.format("%.2f", ave) + "点です。");
	}
}
