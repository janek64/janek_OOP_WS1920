public class VW2_1 {

public static void main (String[] args) {
    System.out.println(k(13.0, 4.0));
}

public static double hoch2 (double x) {
 return x*x;
}

public static double plus3 (double x) {
    return x+3.0;
}

public static double hochx (double x) {
 double ergebnis = 1.0;
 if (x==0) {
     return ergebnis;
 } else {
    for (double i = x; i>0; i--) {
        ergebnis *=2.0;
    }
    return ergebnis;
 }
}

public static double k (double x, double y) {
    if (x>=15.0) {
        return 2.0*y;
    } else {
        return 4.0*y+3.0;
    }
}

}