import java.util.Random;

public class pq {
public static void main (String[] args) {
Random r = new Random();
int p = r.nextInt();
int q = r.nextInt();
System.out.println("Zahlen:" + p + "und" + q);
double d = (Math.pow((p/2), 2.0))-q; //Anlegen der Diskriminante, die angibt, wie viele Lösungen es gibt
//System.out.println(d);
int number; //Variable Number gibt an, wie viele Lösungen es gibt
if (Math.abs(d)<1e-10) { //if-else-Methode wertet Diskriminante aus: Wenn sie größer 0 ist, gibt es zwei Lösungen, wenn sie 0 ist, gibt es eine Lösung, wenn sie kleiner 0 ist, gibt es keine Lösung.
    number=1;
} else {
    if (d>0.0) {
        number=2;
    } else {
    number = 0;
    }
}
//System.out.println(number);
switch (number) { //switch-case-Block führt je nach Zahl der Lösungen die Berechnung durch und gibt das Ergebnis aus
    case 0:
    System.out.println("Keine Lösung!");
    break;
    case 1:
    int x=(-(p/2))+(int)Math.sqrt(d);
    System.out.println("Es gibt eine Lösung:");
    System.out.println("x1 =" + x);
    break;
    case 2:
    int x1=(-(p/2))+(int)Math.sqrt(d);
    int x2=-x1;
    System.out.println("Es gibt zwei Lösungen:");
    System.out.println("x1 =" + x1);
    System.out.println("x2 =" + x2);
}


}
}