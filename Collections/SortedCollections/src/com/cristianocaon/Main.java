package com.cristianocaon;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("Bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("Car", 12.5, 2);
        stockList.addStock(temp);

        temp = new StockItem("Chair", 52.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("Cup", 0.5, 200);
        stockList.addStock(temp);

        temp = new StockItem("Cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("Door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("Juice", 2.5, 36);
        stockList.addStock(temp);

        temp = new StockItem("Phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("Towel", 2.4, 80);
        stockList.addStock(temp);

        temp = new StockItem("Vase", 8.76, 40);
        stockList.addStock(temp);

//        for (String s : stockList.Items().keySet()) {
//            System.out.println(s);
//        }

        Basket timsBasket = new Basket("Tim");
        sellItem(timsBasket, "Car", 1);
        System.out.println(timsBasket);

        sellItem(timsBasket, "Car", 1);
        System.out.println(timsBasket);

        if (sellItem(timsBasket, "Car", 1) != 1) {
            System.out.println("There are no more cars in stock");
        }
        sellItem(timsBasket, "Spanner", 5);
        System.out.println(timsBasket);

        sellItem(timsBasket, "Juice", 4);

        sellItem(timsBasket, "Cup", 12);

        sellItem(timsBasket, "Bread", 1);

        System.out.println(timsBasket);

        System.out.println(stockList);
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        // Retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("\nWe don't sell " + item);
            return 0;
        }
        if (stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
