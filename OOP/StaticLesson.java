package OOP;

public class StaticLesson {
    /*private static int one;
    private static final int two;
    private static final int three = 3;
    static{
        one = 23;
        two = 24;
        int three;
    */
    public static void main(String[] args) {
        int num = 4;
        newNumber(5);
        System.out.println(num);
    }
    public static void newNumber(int num){
        num = 8;
    }
}
