public class VW2_26 {

public static void main (String[] args) {
System.out.println(gregoryleibniz (10000));
}

public static double gregoryleibniz (int n) {
double piviertel = n>0?1.0:0.0;
double nenner = 1.0;
for (int i = 2; i<=n; i++) {
    nenner +=2.0;
    if (i%2==0) {
        piviertel -=1.0/nenner;
    } else {
        piviertel +=1.0/nenner;
    }
}
System.out.println(piviertel);
return piviertel*4;
}

}