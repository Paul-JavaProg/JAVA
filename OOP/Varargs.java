package OOP;

public class Varargs {

    // creating varargs
    public int sumOfAllNums(int y, String p, int... nums){
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
    public static float getEarthsGravity(){
        return 9.81f;
    }
    public static void main(String[] args) {
        
        Varargs v1 = new Varargs();
        System.out.println(v1.sumOfAllNums(1,"2",3,4,5,6,7,8,9,10));
        System.out.println(v1.sumOfAllNums(33,"44",55));
 
    }
    
}
class ClassZ {

    public static void main(String[] args) {
        System.out.println(Varargs.getEarthsGravity());
    }
    
}
