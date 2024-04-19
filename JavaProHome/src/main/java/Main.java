import homeworktenalgo.StockChecker;

public class Main {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        var stockChecker = new StockChecker();
        System.out.println(stockChecker.maxProfit(prices));
    }
}
