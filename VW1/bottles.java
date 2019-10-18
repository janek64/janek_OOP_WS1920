for (int i = 99; i>2; i--) {
    System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
    System.out.println("Take one down and pass it around, " + (i-1) + " bottles of beer on the wall.\n");
}
System.out.println("2 bottles of beer on the wall, 2 bottles of beer.");
System.out.println("Take one down and pass it around, 1 bottle of beer on the wall.\n");
System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
System.out.println("Take one down and pass it around, no more bottles of beer on the wall.\n");
System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.")


/*
zur Variane mit weniger Redundanz: Diese spart die 5 vorletzten Textzeilen, indem sie Strings erstellt, die festlegen,
ob das s hinter Bottle geschrieben wird oder nicht. Ebenso gibt es eine Möglichkeit, die sicherstellt, dass bei den beiden vorletzten Zeilen
no more statt einer Zahl geschrieben wird.
*/