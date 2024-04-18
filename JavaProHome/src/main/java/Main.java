import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        int[] testOne = {1, 2, 3};
        int[] testTwo = {1, 2, 3, 3};
        int[] testThree = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        System.out.println(containsDuplicate(testOne));
        System.out.println(containsDuplicate(testTwo));
        System.out.println(containsDuplicate(testThree));

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }

    public static boolean containsDuplicate(int[] nums) {
        var set = new HashSet<Integer>();
        for (int item : nums) {
            if (!set.add(item)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return false;
        }
        var inputString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        var reversedString = new StringBuilder(inputString).reverse().toString();
        return inputString.equals(reversedString);
    }
}
