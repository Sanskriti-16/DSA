public class Staircase {
  public static void main(String[] args) {
    int  n =6;
    int star =2;
      for(int i=1;i<=n;i++){
          for(int j=1;j<=star;j++) {
            System.out.print("* ");
          }
          if(i%2==0){
              star+=2;
          }
          System.out.println();
      }
  }
}    
