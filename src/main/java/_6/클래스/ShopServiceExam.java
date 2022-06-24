package main.java._6.클래스;

public class ShopServiceExam {
    public static void main(String[] args) {
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if(obj1 == obj2) {
            System.out.println("같은 샵서비스객체 입니다.");
        } else {
            System.out.println("다른 샵서비스객체 입니다.");
        }
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
