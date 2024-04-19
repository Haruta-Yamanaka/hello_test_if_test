import java.util.Random;
public class NetproLabMember {
    public static void main(String[] args) { 
      int years = 15;
      int dataNumber =3;
      int student = 0;
      int percentOfWomen = 1;
      int IwaiKen = 2;
      Random random = new Random();
      int control[] = new int[years];
      int precontrol[] = new int[years];
      float probability[] = new float[years];
      float result = 1;
    int data[][] = new int[years][dataNumber]; 
    for (int i =0;i<years;i++){
       
        int randomNumber = random.nextInt(20) -10;
        int randommenber = random.nextInt(6)-3;
      data[i][student] = 100+randomNumber;
      data[i][percentOfWomen] = 20+i;
      data[i][IwaiKen] = 10+randommenber;
      int StudentOfMen = data[i][student]*(100-data[i][percentOfWomen])/100;
      probability[i] = 1;
      control[i] = 1;
      precontrol[i] = 1;
      for(int m = 0;m<data[i][IwaiKen];m++){
      
        probability[i]*=(float)(StudentOfMen-m)/(data[i][student]-m);
      }
      
      System.out.println((i+1)+"年目:"+"学生総数 "+data[i][student] +"人　"+"女子生徒の割合 "+data[i][percentOfWomen]+"％　"+"岩井研の配属人数 "+data[i][IwaiKen]+"人");
      System.out.println("岩井研に女子が来ない確率: "+probability[i]*100+"％");
      System.out.println("");
       
      result *= probability[i]; 
     }
     System.out.println("岩井研に女子生徒が15年間来ない確率: "+result*100+"％");
    }
}
