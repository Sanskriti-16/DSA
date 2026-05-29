public class Vowel {
  public static boolean isvowel(char ch){
    if(ch== 'a' || ch == 'e' || ch =='i' || ch =='o'|| ch == 'u'){
      return true;
    }
    return false;
  }
public static void main(String[] args){
  System.out.println(isvowel('o'));
  }
} 
