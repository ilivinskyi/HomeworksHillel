import coffee.order.CoffeeOrderBoard;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.add("Obi Wan");
        coffeeOrderBoard.add("Bender");
        coffeeOrderBoard.add("Yoda");
        coffeeOrderBoard.add("R2D2");
        coffeeOrderBoard.add("C3P0");
        coffeeOrderBoard.add("Weider");
        coffeeOrderBoard.add("Solo");
        coffeeOrderBoard.draw();
        coffeeOrderBoard.deliver();
        coffeeOrderBoard.draw();
        coffeeOrderBoard.deliver(5);
        coffeeOrderBoard.draw();
    }
}

// Output:
//Order board is empty
//Order #1 for Obi Wan added
//Order #2 for Bender added
//Order #3 for Yoda added
//Order #4 for R2D2 added
//Order #5 for C3P0 added
//Order #6 for Weider added
//Order #7 for Solo added
//=============
//Num | Name
//1 | Obi Wan
//2 | Bender
//3 | Yoda
//4 | R2D2
//5 | C3P0
//6 | Weider
//7 | Solo
//=============
//Order #1 delivered
//=============
//Num | Name
//2 | Bender
//3 | Yoda
//4 | R2D2
//5 | C3P0
//6 | Weider
//7 | Solo
//=============
//Order #5 delivered
//=============
//Num | Name
//2 | Bender
//3 | Yoda
//4 | R2D2
//6 | Weider
//7 | Solo
//=============
