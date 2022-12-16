package task047_Products;

public class Main {
    public static void main(String[] args) {
        /* Инициализация товаров */
        System.out.println("ТОВАРЫ");
        Drink water = new Drink(0, "Aqua Minerale", 86, 2.0);
        Drink cocaCola = new Drink(0, "Coca Cola", 86, 3.0);
        Snack snack = new Snack(1, "Mars", 90);
        HotDrink coffee1 = new HotDrink(1, "кофе", 100, 0.5, 50);
        HotDrink coffee2 = new HotDrink(1, "кофе", 100, 0.7, 50);
        HotDrink kakao = new HotDrink(1, "какао", 100, 0.5, 50);

        /* Инициализация торговых автоматов */
        Automat automat = new Automat(1, "Торговый автомат", 10);
        DrinkAutomat drinkAutomat = new DrinkAutomat(1, "Автомат воды", 10);
        HotDrinkAutomat hotDrinkAutomat = new HotDrinkAutomat(3, "Автомат горячих напитков", 10);

        /* Создание списков товаров */
        Product[] products = new Product[] { water, cocaCola, snack };
        Drink[] drinkLst = new Drink[] { water, cocaCola };
        HotDrink[] hotDrinkLst = new HotDrink[] { coffee1, coffee2, kakao };

        /* Добавление списка товаров в автомат */
        automat.InitProducts(products);
        drinkAutomat.InitProducts(drinkLst);
        hotDrinkAutomat.InitProducts(hotDrinkLst);

        /* Печать найденных товаров в списке товаров торговых автоматов */
        automat.getProduct("Mars");
        drinkAutomat.getProduct("Aqua Minerale", 2.0);
        hotDrinkAutomat.getProduct("кофе", 0.5, 50);
    }
}
