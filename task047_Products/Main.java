package task047_Products;

public class Main {
    public static void main(String[] args) {
        /* Инициализация товаров */
        System.out.println("ТОВАРЫ");
        Drink water = new Drink("Aqua Minerale", 86, 2.0);
        Drink cocaCola = new Drink("Coca Cola", 86, 3.0);
        Snack snack = new Snack("Mars", 90);
        HotDrink coffee1 = new HotDrink("кофе", 100, 0.5, 50);
        HotDrink coffee2 = new HotDrink("кофе", 100, 0.7, 50);
        HotDrink kakao = new HotDrink("какао", 100, 0.5, 50);

        /* Инициализация торговых автоматов */
        Automat automat = new Automat("Торговый автомат", 10);
        DrinkAutomat drinkAutomat = new DrinkAutomat("Автомат воды", 10);
        HotDrinkAutomat hotDrinkAutomat = new HotDrinkAutomat("Автомат горячих напитков", 10);

        /* Создание списков товаров */
        Product[] products = new Product[] { water, cocaCola, snack };
        Product[] drinkLst = new Drink[] { water, cocaCola };
        Product[] hotDrinkLst = new HotDrink[] { coffee1, coffee2, kakao };

        /* Добавление списка товаров в автомат */
        automat.InitProducts(products);
        drinkAutomat.InitProducts(drinkLst);
        hotDrinkAutomat.InitProducts(hotDrinkLst);

        /* Печать найденных товаров в списке товаров торговых автоматов */
        System.out.println(automat.getProduct("Mars"));
        System.out.println(drinkAutomat.getProduct("Aqua Minerale", 2.0));
        System.out.println(hotDrinkAutomat.getProduct("кофе", 0.5, 50));
    }
}