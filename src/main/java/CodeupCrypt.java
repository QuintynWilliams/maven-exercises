public class CodeupCrypt {

    public static double version;

    public static String hashPassword(String propType) {
        StringBuilder hash = new StringBuilder();
        for (char letter : propType.toCharArray()){
            switch (letter) {
                case 'a', 'A' -> hash.append(4);
                case 'e', 'E' -> hash.append(3);
                case 'i', 'I' -> hash.append(1);
                case 'o', 'O' -> hash.append(0);
                case 'u', 'U' -> hash.append(9);
                default -> hash.append(letter);
            }
        }
        return hash.toString();
    }

    public static boolean checkPassword(String propType, String hashType) {
        return hashType.equals(hashPassword(propType));
    }
}
