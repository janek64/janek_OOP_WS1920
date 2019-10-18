public class VW2_6 {

public static void main (String[] args) {
int [] nummern = {5, 3, 20, 1, 9, 0, 15, 15, 16};
printArray(nummern);
naiveSort(nummern);
printArray(nummern);
}

public static void naiveSort(int[] numbers) {
    for(int i = 0; i < numbers.length; i++) {
        // finde den Index der kleinsten Zahl beginnend beim Index i
        int minI = indexOfMin(numbers, i);
        // tausche den Inhalt des Arrays an Stelle i mit dem an Stelle minI
        swap(numbers, i, minI);
    }
}

public static int indexOfMin (int[] array, int index) {
    int minIndex = index;
    int minZahl = array[index];
    for (int i = index++; i<array.length; i++) {
        if (array[i]<minZahl) {
            minIndex = i;
            minZahl = array[i];
        }
    }
    return minIndex;
}

public static void swap (int[] array, int a, int b) {
    if (a!=b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}

public static void printArray (int[] array) {
    for (int i = 0; i<array.length; i++) {
        System.out.print(array[i] + " ");
    }
    System.out.println("Array printed!");
}

}