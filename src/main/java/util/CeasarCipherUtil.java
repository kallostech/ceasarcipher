package util;

public class CeasarCipherUtil {

    public String encipher (String text, int shift){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) < 65 || text.charAt(i) > 90) { //znak v ASCII
                throw new IllegalArgumentException("" +
                        "The string does not contain only uppercase characters");
            }
            char enciphered = text.charAt(i) + shift > 90 ? (char) ((text.charAt(i) + shift) - 26) : (char) (text.charAt(i) + shift);
            builder.append(enciphered);
        }
        return builder.toString();
    }

    public String decipher (String text, int shift){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) < 65 || text.charAt(i) > 90) { //znak v ASCII
                throw new IllegalArgumentException("" +
                        "The string does not contain only uppercase characters");
            }
            char deciphered = text.charAt(i) - shift < 65 ? (char) ((text.charAt(i) - shift) + 26) : (char) (text.charAt(i) - shift);
            builder.append(deciphered);
        }
        return builder.toString();
    }
}
