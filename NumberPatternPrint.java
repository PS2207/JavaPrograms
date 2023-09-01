public class NumberPatternPrint{
  
  public static void numberPrint(){

    int n=10;
    for(int i=1;i<=n;i++){
      for(int j=1;j<i;j++){
        System.out.print(" ");
      }
      for(int h=i;h<=n;h++){
        System.out.print(h+" ");
      }
      System.out.println();
    }
    for(int i=n-1;i>=1;i--){
      for(int j=1;j<i;j++){
        System.out.print(" ");
      }
      for(int k=i;k<=n;k++){
        System.out.print(k+" ");
      }
      System.out.println();
    }
  }
  
  public static void main(String ar[]){
    
    NumberPatternPrint.numberPrint();
  }
}