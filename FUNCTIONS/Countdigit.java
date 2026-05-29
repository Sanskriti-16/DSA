public class Countdigit {
    public static void Contdigit(int n){
        int count = 0;
        while(n!=0){
            count ++;
            n/=10;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Contdigit(12345);
    }
}    
