/*
for (int i=1; i<=100; i++) {
    if(i%3==0&&i%5==0) {
        System.out.println("Fizzbuzz");
    } else {
        if (i%3==0) {
        System.out.println("Fizz");
        } else {
            if(i%5==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
*/

//schöner, nach Lösung:
for (int i = 1; i<=100; i++) {
    String fb ="";
    if(i%3==0) {
        fb= fb + "fizz";
    }
    if (i%5==0) {
        fb= fb + "buzz";
    }
    if (fb.length()>0) {
        System.out.println(fb);
    } else {
        System.out.println(i);
    }
}
