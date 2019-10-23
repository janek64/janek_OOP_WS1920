//author @Janek B.
public class VW2_7 {

public static void main (String[] args) {
System.out.println(mulFor(5, 6));
System.out.println(mulWhile(4, 18));
System.out.println(mulDoWhile(23, 3));
}


public static int mulFor (int faktor1, int faktor2) {
int ergebnis = 0;
for (int i = faktor2; i>0; i--) {
    ergebnis +=faktor1;
}
return ergebnis;
}


public static int mulWhile (int faktor1, int faktor2) {
int ergebnis = 0;
while (faktor2>0) {
    ergebnis +=faktor1;
    faktor2--;
}
return ergebnis;
}

public static int mulDoWhile (int faktor1, int faktor2) {
int ergebnis = 0;
if (faktor2==0) return ergebnis;
do {
    ergebnis +=faktor1;
    faktor2--;
} while (faktor2>0);
return ergebnis;
}

}