import java.util.Random;

public class VW2_11 {

public static void main (String[] args) {
int[] array = randomIntArray(10, 0.4);
printArray(array);
}

public static int[] randomIntArray(int size, double percent) {
    int n = (int) (percent * size);
    int[] array = new int[size];
    Random r = new Random();
    while(n > 0) {
        int next = r.nextInt(size);
        if (array[next]==1) continue;
        array[next] = 1;
        n--;
    }
    pruefung(array, percent, size);
    return array;
}

public static void pruefung(int[] array, double percent, int size) {
int sum=0; 
    for (int i = 0; i<array.length; i++) {
        if (array[i]==1) {
            sum++;
        }
    }
int n = (int) (percent*size);
if (sum==n) {
    System.out.println("Korrekt");
} else {
    throw new AssertionError();
}
}

public static void printArray (int[] array) {
    for (int i = 0; i<array.length; i++) {
        System.out.print(array[i] + " ");
    }
    System.out.println("Array printed!");
}





}