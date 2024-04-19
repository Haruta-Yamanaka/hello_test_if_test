

// C言語では、#include に相当する
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HowOldAreYou {
    /**
     * @param args
     */
    public static void main(String[] args) { 

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			// BufferedReader というのは、データ読み込みのクラス(型)
			// クラスの変数を作るには、new を使う。

			// readLine() は、入出力エラーの可能性がある。エラー処理がないとコンパイルできない。
			//  Java では、 try{ XXXXXXXX }  catch(エラーの型 変数) { XXXXXXXXXXXXXXXXXX} と書く
boolean isEnd = false;

		while(isEnd == false){
            try {
            String eraName = "null";
			System.out.println("何歳ですか?");
			String line = reader.readLine();
			
            if(line.equals("q")||line.equals("e")){
				System.out.println("終了します");
				isEnd = true;
                break;
			}
            int age = Integer.parseInt(line);
            int era = 2024;
            int birthEra =  era - age;
            int eraNumber = 0;

            if(birthEra > 2019){
                eraName ="令和";
                eraNumber = birthEra-2019;
            }
           else if(birthEra >=1989){
            eraName = "平成";
            eraNumber = birthEra-1989;
           }
           else if(birthEra > 1926){
            eraName = "昭和";
            eraNumber = birthEra-1926;
           }
           else if(birthEra > 1912){
            eraName = "大正";
            eraNumber = birthEra-1912;
           }
           else {
            eraName = "明治";
            eraNumber = birthEra-1867;
           }

           if(age < 120 && age >= 0){
            System.out.println("あなたは" + age + "歳ですね。");
            System.out.println("あなたは"+ eraName +eraNumber +"年"+"生まれですね。");
			System.out.println("あなたは2030年には、" + (age + (2030-era)) + "歳ですね。");
           }
           else {
            System.out.println("不正な値です。入力しなおしてください");
           }
			
        }
      
            
        
        
		
		catch(IOException e) {
			System.out.println(e);
		}
    }

	}
}
