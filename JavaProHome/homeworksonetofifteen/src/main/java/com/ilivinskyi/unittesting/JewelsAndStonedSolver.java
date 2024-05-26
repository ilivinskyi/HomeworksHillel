package unittesting;

public class JewelsAndStonedSolver {

    public int numJewelsInStones(String jewels, String stones) {
        var counter = 0;
        char[] charArray = stones.toCharArray();
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < charArray.length; j++) {
                if (jewels.charAt(i) == charArray[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
