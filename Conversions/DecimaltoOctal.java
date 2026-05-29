public class DecimaltoOctal {
    public static void main(String[] args) {
        int num = 10010;
        int new_num =0;
        int update =1;
        while(num>0){
            int r = num%8;
            new_num= new_num+r*update;
            update *=10;
            num/=8;
            }
        System.out.println(new_num);
        }
    }    