public class VW3_6 {

    public static void main (String[] args) {
        String stanza = "Drei Chinesen mit dem Kontrabass ...";
        char vowel = 'a';
        System.out.println(replaceStanza(stanza, vowel));
    }

    public static String replaceStanza(String stanza, char vowel) {
        stanza = stanza.replace('a', vowel);
        stanza = stanza.replace('e', vowel);
        stanza = stanza.replace('i', vowel);
        stanza = stanza.replace('o', vowel);
        stanza = stanza.replace('u', vowel);
        return stanza;
    }
}