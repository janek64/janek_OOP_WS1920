public class VW2_31 {

public static void main (String[] args) {
printP(pascalTriangle(7));
}

public static int[][] pascalTriangle(int n) {
int[][] triangle = new int[n][];
if (n>0) {
    triangle[0] = new int[1];
    triangle[0][0] = 1;
}
for (int i = 1; i<n; i++) {
    triangle[i] = new int[i+1];
    triangle[i][0] = 1;
    triangle[i][i] = 1;
    for (int j = 1; j<triangle[i].length-1; j++) {
        triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
    }
}
return triangle;
}

public static void printP(int[][] triangle) {
for (int i = 0; i<triangle.length; i++) {
    for (int j = 0; j<triangle[i].length; j++) {
        System.out.print(triangle[i][j] + " ");
    }
System.out.println("");
}
}
}