public class Evensum {
  public static void add(int start, int end){
    int sum =0;
    for(int i = start; i<=end;i++){
      if(i%2==0){
        sum +=i;
      }
    }
    System.out.println(sum);
  }
  public static void main(String[] args) {
    add(10,1);
  }
}
