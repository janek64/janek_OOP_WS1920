public class VW3_4 {

    public static void main (String[] args) {
        System.out.println(countNeedle("Donaudampfschifffahrtsgesellschaftskapitänsmützenbommel", "ts"));
    }

    public static int countNeedle (String haystack, String needle) {
        return (haystack.length()-haystack.replaceAll(needle, "").length())/needle.length();
    }



}