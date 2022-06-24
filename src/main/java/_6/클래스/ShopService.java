package main.java._6.클래스;

public class ShopService {

    private static ShopService singleValue = new ShopService();

    private ShopService() {
    }

    static ShopService getInstance() {
        return singleValue;
    }
}
