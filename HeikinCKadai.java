import java.util.Random;
public class HeikinCKadai {
public static final int N=100;
	Kamoku[] kamoku = new Kamoku[N];
	static String kamokuname="数学";

	public static void main(String[] args) {
		HeikinCKadai heikinb= new HeikinCKadai(kamokuname);
		heikinb.initalizeScores();
		heikinb.printAverage();
		heikinb.gokakusha();

	}
	
	HeikinCKadai(String s){
		this.kamokuname=s;
		
	}
	void initalizeScores(){
		Random r = new Random();

		for(int i=0;i<N;i++){
			int score = r.nextInt(N+1);
			kamoku[i]= new Kamoku(score,i+1);

		}
	
	}
	
   void printAverage(){
		int sum=0;
	   for(int i=0;i<N;i++){

		   sum+=kamoku[i].getScore();

	   }
	   System.out.println("平均点は"+sum/N);

	}

	void gokakusha(){
		
int[] gokakusya  = new int[N];
int[] studentId = new int[N];
int id = 1;
int i = 0;
String idNumber;
		//if
		System.out.println("以下、合格者の点数です。");
		for(Kamoku k : kamoku){
			if(k.score>=80){
                idNumber = String.valueOf(id);
				
				studentId[i] = k.getId();
				gokakusya[i] = k.score;
				System.out.println("学籍番号 ："+id+" ,  点数 :"+gokakusya[i]);
				i++;
			}
            id++;
        }
	}

}
