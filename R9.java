import sun.text.normalizer.UCharacter;

public class R9 {

        public static String removePunctuation(String s) {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Character.isLetterOrDigit(c)) {
                    sb.append(c);
                } else if (Character.isWhitespace(c)) {
                    sb.append(c);

                }
            }
            return sb.toString();
        }

        public static void main(String[] args) {
            String sentence = "Asma'a try again ,again ,again and again!!";
            String cleanedSentence = removePunctuation(sentence);
            System.out.println(cleanedSentence);
        }
}

