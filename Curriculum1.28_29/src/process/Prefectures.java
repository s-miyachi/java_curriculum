package process;

import java.util.Arrays;
import java.util.Scanner;

public class Prefectures {
	
	public void display() {
		
		// Scannerメソッド
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
				
		scanner.close();
				
		//「,」で区切る
		String[] stringArray = input.split(",");
				
		//String型配列　を　int型配列に変換
		int intArray[] = new int[stringArray.length];
				
		for(int i = 0; i < stringArray.length; i++) {
					
			int strArr = Integer.parseInt(stringArray[i]);
					
			intArray[i] = strArr;
					
		}
				
		//都道府県配列、格納
		String[] prefecturesInfo = {"北海道:札幌市:83424", // 0
									"青森県:青森市:9646",  // 1
									"岩手県:盛岡市:15275", // 2
									"宮城県:仙台市:7282",  // 3
									"秋田県:秋田市:11638", // 4
									"山形県:山形市:9323",  // 5
									"福島県:福島市:13784", // 6
									"茨城県:水戸市:6097",  // 7
									"栃木県:宇都宮市:6408",// 8 
									"群馬県:前橋市:6362",  // 9
									"埼玉県:さいたま市:3798"}; // 10

				//ソート判定
		if(input2.equals("昇順")) {
					
			Arrays.sort(intArray);
					
			for(int i = 0 ; i < intArray.length; i++) {
						
				Arrays.toString(intArray);
						
				String[] prefecturesData = prefecturesInfo[intArray[i]].split(":");
				String name = prefecturesData[0];
				String city = prefecturesData[1];
				double area = Double.parseDouble(prefecturesData[2]);
						
				System.out.println("都道府県名：" + name);
				System.out.println("県庁所在地：" + city);
				System.out.println("面積：" + area + "km2");
				System.out.println("");
						
			}
					
		}else if(input2.equals("降順")) {
					
					
		for(int i = 0 ; i < intArray.length; i++) {
						
				Arrays.sort(intArray);
					
				for(int f = 0, l = intArray.length - 1; f < l; f++, l--) {
						
					int temp = intArray[f];
							
					intArray[f] = intArray[l];
							
					intArray[l] = temp;
						
				}
						
			Arrays.toString(intArray);
						
			String prefecturesData[] = prefecturesInfo[intArray[i]].split(":");
			String name = prefecturesData[0];
			String city = prefecturesData[1];
			double area = Double.parseDouble(prefecturesData[2]);
						
			System.out.println("都道府県名：" + name);
			System.out.println("県庁所在地：" + city);
			System.out.println("面積：" + area + "km2");
			System.out.println("");
						
			}
		
		}else {
					
			System.out.println(" 昇順 or 降順 を入力してください");
					
		}
		
		
		
		
		
		
	}

}
