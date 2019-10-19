public class VW2_21 {

public static void main (String[] args) {
System.out.println(add(10, 15));
System.out.println(mul(5, 3));
}


public static int add (int x, int y) {
if (y==0) {
    return x;
} else {
    return add(++x, --y);
}
}

public static int mul (int x, int y) {
if (y==0) return 0;
if (y==1) {
    return x;
} else {
   return add(x, mul(x, --y));
}
}

}