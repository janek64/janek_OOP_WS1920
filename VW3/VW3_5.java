public class VW3_5 {

    public static void main (String[] args) {
    String stuff = "1,2,4,7,22,91,1080";
    System.out.println(StringDifference(stuff));
    }

    public static int StringDifference(String stuff) {
        String[] array = stuff.split(",", 0);
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[array.length-1]);
        return b-a;
    }
}