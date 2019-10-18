public class VW2_16 {

public static void main (String[] args) {
printArray(cumsum(new int[]{1,2,3,4,5}));
printArray(cumsum(new int[]{1,-1,1,-1}));
printArray(cumsum(new int[0]));
}

public static int[] cumsum (int[] array) {
int [] cumsum = new int[array.length];
if (array.length==0) return cumsum;
cumsum [0] = array[0];
int arraysum = array[0];
    for (int i = 1; i<array.length; i++) {
        arraysum+=array[i];
        cumsum[i] = arraysum;
    }
    return cumsum;
}

public static void printArray (int[] array) {
    for (int i = 0; i<array.length; i++) {
        System.out.print(array[i] + " ");
    }
    System.out.println("Array printed!");
}

}