public class XmasTreeKadai {
    public static void main(String[] args) { 
    int widthOfStem = 3;
    int widthOfTree = 19;
    int lengthOfStem = 7;
    String c = "+";

    for(int i = 0;i<widthOfTree;i++){
        
        for(int s = 0;s<widthOfTree-i;s++){
           if(s<widthOfTree-i-1){

           if(s%3 ==(i%2)){
            
            System.out.print(c);
           }
           else{
            System.out.print(" ");
           }
        }
        }
       
        for(int m = 0;m<i;m++){
            System.out.print("**");
        }
        System.out.println("");
    }
    for(int i = 0;i<lengthOfStem;i++){
        for(int s = 0;s<widthOfTree-2;s++){
            System.out.print(" ");
        }
        System.out.println("***");
    }
    
    }
}
