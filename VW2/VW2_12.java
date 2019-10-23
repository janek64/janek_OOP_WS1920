public class VW2_12 {

public static void main (String[] args) {
int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
System.out.println(sum4(array));
}

public static int sum4(int[] a) {
    int sum = 0;
    for (int i=0; i<4*a.length; i++) {
        sum += a[i % a.length];
    }
    return sum;
}

}