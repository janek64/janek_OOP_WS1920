import java.util.Random;

public class VW3_7 {

    public static void main (String[] args) {
        Random r = new Random();
        int var1 = r.nextInt(1000);
        int var2 = r.nextInt(1000);
        System.out.printf("%-3d| %n", var1);
        System.out.printf("%-3d| %n", var2);
        System.out.printf("%3d| %n", var1);
        System.out.printf("%3d| %n", var2);
    }   

}