package task048_Automat;

import task048_Automat.controllers.AutomatController;
import task048_Automat.controllers.OrderController;
import task048_Automat.models.Automat;
import task048_Automat.models.automats.DrinkSnackAutomat;
import task048_Automat.models.automats.GameAutomat;
import task048_Automat.models.automats.HotDrinkAutomat;
import task048_Automat.models.products.Coffee;
import task048_Automat.models.products.Doll;
import task048_Automat.models.products.Drink;
import task048_Automat.models.products.Snack;
import task048_Automat.models.products.SoftTots;
import task048_Automat.models.products.Tea;
import task048_Automat.repository.AutomatRepository;
import task048_Automat.repository.OrderRepository;
import task048_Automat.services.AutomatServices;
import task048_Automat.services.OrderServices;

public class Main {
    public static void main(String[] args) {
        DrinkSnackAutomat drinkSnackAutomat = new DrinkSnackAutomat("Торговый автомат напитков и закусок", 10);
        HotDrinkAutomat hotDrinkAutomat = new HotDrinkAutomat("Торговый автомат горячих напитков", 10);
        GameAutomat gameAutomat = new GameAutomat("Торговый автомат игрушек", 10);

        Drink stillWater = new Drink("Вода негазированная", 40, 0.5);
        Drink sparklingWater = new Drink("Вода газированная", 50, 0.5);
        Snack chips = new Snack("Чипсы", 100, 0.2);
        Snack mars = new Snack("Mars", 110, 0.2);

        Coffee cappuccino = new Coffee("Кофе каппучино", 110, 0.5, 50);
        Coffee espresso = new Coffee("Кофе эспрессо", 125, 0.5, 55);
        Tea blackTea = new Tea("Чай черный", 95, 0.5, 90);
        Tea greenTea = new Tea("Чай зелёный", 105, 0.5, 80);

        SoftTots smallTeddyBear = new SoftTots("Маленький плюшевый мишка", 500);
        SoftTots bigTeddyBear = new SoftTots("Большой плюшевый мишка", 1000);
        Doll girl = new Doll("Кукла девочка", 1100);
        Doll boy = new Doll("Кукла мальчик", 1200);

        AutomatRepository automatRepository = new AutomatRepository();
        automatRepository.AddAutomat(drinkSnackAutomat);
        automatRepository.AddAutomat(hotDrinkAutomat);
        automatRepository.AddAutomat(gameAutomat);

        OrderRepository orderRepository = new OrderRepository();

        AutomatServices automatServices = new AutomatServices(automatRepository);
        OrderServices orderServices = new OrderServices(orderRepository);

        drinkSnackAutomat.AddProduct(stillWater, 3);
        drinkSnackAutomat.AddProduct(sparklingWater, 3);
        drinkSnackAutomat.AddProduct(chips, 3);
        drinkSnackAutomat.AddProduct(mars, 3);

        gameAutomat.AddProduct(smallTeddyBear, 3);
        gameAutomat.AddProduct(bigTeddyBear, 3);
        gameAutomat.AddProduct(boy, 3);
        gameAutomat.AddProduct(girl, 3);

        hotDrinkAutomat.AddProduct(cappuccino, 1);
        hotDrinkAutomat.AddProduct(espresso, 1);
        hotDrinkAutomat.AddProduct(blackTea, 1);
        hotDrinkAutomat.AddProduct(greenTea, 1);

        AutomatController automatController = new AutomatController(automatServices);
        Automat automat = automatController.getUserChoice();
        automatController.CompareTwoProducts(smallTeddyBear, bigTeddyBear);

        OrderController orderController = new OrderController(orderServices, automat);
        orderController.doOrder();
        automatController.getBestProductInAutomat();
    }
}
