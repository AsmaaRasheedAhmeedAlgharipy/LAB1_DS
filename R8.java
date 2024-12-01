public class R8 {

        public static int countVowels(String str) {
            int count = 0;
            for (char c : str.toCharArray()) {
                switch (Character.toLowerCase(c)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        count++;
                }
            }
            return count;
        }

        public static void main(String[] args) {
            String str = "Asmaa Rasheed Ahmeed Al_gharipy";
            int vowelCount = countVowels(str);
            System.out.println("Number of vowels in 1  \"" + str + "\": " + vowelCount);
        }
}

