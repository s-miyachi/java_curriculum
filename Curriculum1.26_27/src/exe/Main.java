package exe;

import java.util.Scanner;

import pro.AnimalStatus;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("コンソールに文字を入力してください");
		
		Scanner scan = new Scanner (System.in);
		String input = scan.nextLine();
		
		//「,」で区切る
		String[] animals = input.split(",");
		System.out.println("");
		scan.close();
		
		AnimalStatus animalstatus = new AnimalStatus();
		animalstatus.animalStatus(input, 0, 0, input);
		
		//「,」で区切った文字列をさらに「：」で区切り、各データに分割して出力
		for(String animalString : animals) {
			
			//
			String animaldata[] = animalString.split(":");
			String name = animaldata[0];
			double length = Double.parseDouble(animaldata[1]);
			int speed = Integer.parseInt(animaldata[2]);
			String scientificName = getScientificName(name);
			
			//コンソールに出力
			System.out.println("動物名：" + name);
	        System.out.println("体長：" + length + "m");
	        System.out.println("速度：" + speed + "km/h");
	        System.out.println("学名：" + scientificName + "\n");
		}
		
	}
	private static String getScientificName(String name) {
        switch (name) {
            case "ライオン":
                return "パンテラ レオ";
            case "ゾウ":
                return "ロキソドンタ・サイクロティス";
            case "パンダ":
                return "アイルロポダ・メラノレウカ";
            case "チンパンジー":
                return "パン・トゥログロディテス";
            case "シマウマ":
                return "チャップマンシマウマ";
            default:
                return "不明";
        }
	}
}
