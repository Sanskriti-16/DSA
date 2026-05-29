public class DecimaltoBinary {
    public static void main(String[] args) {
        int num = 10010;
        int new_num =0;
        int update =1;
        while(num>0){
            int r = num%2;
            new_num= new_num+r*update;
            update *=10;
            num/=2;
            }
        System.out.println(new_num);
        }
    }
