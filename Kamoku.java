public class Kamoku {
    String name;
	int score;
	private int studentid;

	Kamoku(int s ,int id) {  // これがコンストラクタ。特殊なメソッド。クラス名と同じ。
		score = s; 
		studentid = id;
	}

// setScore というメソッドを定義する。
// score に値を設定する。
	public void setScore(int num){
		score = num;
	}

// getScore というメソッドを定義する。
// scoreを返す。
	public int getScore() {
		return score;
	}

	public int getId(){
		return studentid;
	}
}


