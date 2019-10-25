public class VW3_3 {

public static void main (String[] args) {
System.out.println(allowedForIf(8));
System.out.println(allowedForSwitch(15));
}

public static String allowedForIf(int age) {
    String s = new String();
    //if (age>0) s += "Kleinkinder, ";
    if (age>5) s+= "Schulkinder";
    if (age>11) s+= ", Jugendliche";
    if (age>15) s+= ", reife Jugendliche";
    if (age>17) s+= ", Erwachsene";
    if (s.length()==0) return "nur Kleinkinder";
    return s;
}

public static String allowedForSwitch(int age) {
    switch (age) {
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        return "nur Kleinkinder";
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        return "Schulkinder";
        case 12:
        case 13:
        case 14:
        case 15:
        return "Schulkinder, Jugendliche";
        case 16:
        case 17:
        return "Schulkinder, Jugendliche, reife Jugendliche";
        default:
        return "Schulkinder, Jugendliche, reife Jugendliche, Erwachsene";
    }
}


}