public class table{
    public static void Table(int n) {
        for (int i = 1; i < 11; i++) {
            System.out.println(n + "X" +i +"="+ n*i);
        }
    }
    public static void main(String[]args) {
        Table(7);
    }
}