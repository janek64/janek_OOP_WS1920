public class VW_38 {

    public static void main (String[] args) {
        tester();
    }

public static void tester () {
    for (int i = 10; i<=120; i++) {
        System.out.println(thousands(i));
    }
}

public static String ones(int n) { // finale Implementierung
    String[] ones = {"null", "eins", "zwei", "drei", "vier",
                     "fünf", "sechs", "sieben", "acht", "neun"};
    return " " + ones[n];
}

public static String tens (int n) {
    if (n<10) return ones(n);
    int tennumber = n / 10;
    int onenumber = n % 10;
    String[] tens = {"zehn", "zwanzig", "dreißig", "vierzig", "fünzig",
                    "sechzig", "siebzig", "achtzig", "neunzig"};
    if (tennumber==1) {
        if (onenumber==0) return " zehn";
        if (onenumber==1) return " elf";
        if (onenumber==2) return " zwölf";
        if (onenumber==6) return " sechzehn";
        if (onenumber==7) return " siebzehn";
        return ones(onenumber) + " zehn";
    }
    if (onenumber>1) {
    return ones(onenumber) + "und" + tens[tennumber-1];
    } else {
        if (onenumber==1)  return " einund" + tens[tennumber-1];
        if (onenumber==0) return " " + tens[tennumber-1];
    }
    return "";
}

public static String hundreds (int n) {
    if (n<100) return tens(n);
    int hundrednumber = n / 100;
    String[] hundreds = {"einhundert", "zweihundert", "dreihundert", "vierhundert","fünfhundert",
                        "sechshundert", "siebenhundert", "achthundert", "neunhundert"};
    if (n%100==0) return " " + hundreds[hundrednumber-1];
    return " " + hundreds[hundrednumber-1] + tens(n-(hundrednumber*100));
}

public static String thousands (int n) {
    int thousandnumber = n/1000;
    if (n<1000) return hundreds (n);
    if (n==1000) return "eintausend";
    if (n<2000) {
        return "eintausend" + hundreds(n-(thousandnumber*1000));
    }
    if (n<10000) {
        if (n%1000==0) return ones(thousandnumber) + "tausend";
        return ones(thousandnumber) + "tausend" + hundreds(n-(thousandnumber*1000));
    }
    if (n<100000) {
        if (n%1000==0) return tens (thousandnumber) + "tausend";
        return tens(thousandnumber) + "tausend" + hundreds(n-(thousandnumber*1000));
    }
    if (n<1000000) {
        if (n%1000==0) return hundreds (thousandnumber) + "tausend";
        return hundreds(thousandnumber) + "tausend" + hundreds(n-(thousandnumber*1000));
    }
    return "wrong";
}

}


