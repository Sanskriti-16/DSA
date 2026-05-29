    // palindrome number
    public class palindrome {
    public static void main(String[] args) {
        int num = 12321;
        int reverse = 0;
        int originalNum = num;
        while(num>0){
            reverse = reverse*10 + num%10;
            num/=10;
        }
        if(originalNum == reverse){
            System.out.println("Palindrome number");
        }else{
            System.out.println("Not a palindrome number");
        }
    }
} 

