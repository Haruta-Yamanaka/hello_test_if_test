import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MayExceptionTest {
	public static void main(String[] args) {

		MayExceptionTest myE=new MayExceptionTest();

	}

	MayExceptionTest(){
        boolean Flag = false;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader というのは、データ読み込みのクラス(型)
		// クラスの変数を作るには、new を使う。

		// readLine() は、入出力エラーの可能性がある。エラー処理がないとコンパイルできない。
		//  Java では、 try{ XXXXXXXX }  catch(エラーの型 変数) { XXXXXXXXXXXXXXXXXX} と書く
        while(Flag == false){
		try {
			System.out.println("何日ですか?");
			String line = reader.readLine();
			int theday = Integer.parseInt(line);
			System.out.println("日付" + theday + "日ですね。");

			test(theday);

		}
		catch(IOException e) {
			System.out.println(e);
		} catch (NoHolidayException e) {
			e.printStackTrace();
            Flag = true;

		}
    }
	}

	void test(int theday) throws NoHolidayException{
		if(theday==6){
			throw new NoHolidayException();
		}
	}

}
