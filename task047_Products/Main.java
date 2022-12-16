package task047_Products;

public class Main {
    public static void main(String[] args) {
        Drink water = new Drink(0, "Aqua Minerale", 86, 2.0);
        Drink cocaCola = new Drink(0, "Coca Cola", 86, 3.0);
        System.out.println(water);
        System.out.println("----------");

        Snack snack = new Snack(1, "Mars", 90);
        System.out.println(snack);
        System.out.println("----------");

        Automat automat = new Automat(1, "Торговый автомат", 10);
        System.out.println(automat);
        System.out.println("----------");

        Product[] products = new Product[] { water, cocaCola, snack };
        automat.InitProducts(products);
        automat.getProducts();
        System.out.println("----------");
        automat.getProduct("Mars");

        Drink[] drinkLst = new Drink[] { water, cocaCola };
        DrinkAutomat drinkAutomat = new DrinkAutomat(1, "Автомат воды", 10);
        drinkAutomat.InitProducts(drinkLst);
        System.out.println(drinkAutomat);
        System.out.println("----------");
        drinkAutomat.getProducts();
        System.out.println("----------");
        drinkAutomat.getProduct("Aqua Minerale", 2.0);
        System.out.println("----------");

        HotDrink coffee1 = new HotDrink(1, "кофе", 100, 0.5, 50);
        HotDrink coffee2 = new HotDrink(1, "кофе", 100, 0.7, 50);
        HotDrink kakao = new HotDrink(1, "какао", 100, 0.5, 50);
        HotDrink[] hotDrinkLst = new HotDrink[] {coffee1, coffee2, kakao};
        HotDrinkAutomat hotDrinkAutomat = new HotDrinkAutomat(3, "Автомат горячих напитков", null);
        hotDrinkAutomat.InitProducts(hotDrinkLst);
        hotDrinkAutomat.getProducts();
        System.out.println("----------");
        hotDrinkAutomat.getProduct("кофе", 0.5, 50);
    }
}
