package task049_Automat;

import task049_Automat.controllers.AutomatController;
import task049_Automat.controllers.OrderController;
import task049_Automat.models.Automat;
import task049_Automat.models.automats.DrinkSnackAutomat;
import task049_Automat.models.automats.GameAutomat;
import task049_Automat.models.automats.HotDrinkAutomat;
import task049_Automat.models.products.Coffee;
import task049_Automat.models.products.Drink;
import task049_Automat.models.products.Doll;
import task049_Automat.models.products.Snack;
import task049_Automat.models.products.SoftTots;
import task049_Automat.models.products.Tea;
import task049_Automat.repository.AutomatRepository;
import task049_Automat.repository.OrderRepository;
import task049_Automat.services.AutomatServices;
import task049_Automat.services.OrderServices;

public class Main {
    public static void main(String[] args) {
        DrinkSnackAutomat drinkSnackAutomat = new DrinkSnackAutomat("Торговый автомат напитков и закусок", 10);
        HotDrinkAutomat hotDrinkAutomat = new HotDrinkAutomat("Торговый автомат горячих напитков", 10);
        GameAutomat gameAutomat = new GameAutomat("Торговый автомат игрушек", 10);

        Drink stillWater = new Drink("Вода негазированная", 40, 0.5);
        Drink sparklingWater = new Drink("Вода газированная", 40, 0.5);
        Snack chips = new Snack("Чипсы", 100, 0.2);
        Snack mars = new Snack("Mars", 100, 0.2);

        Coffee cappuccino = new Coffee("Кофе каппучино", 110, 0.5, 50);
        Coffee espresso = new Coffee("Кофе эспрессо", 125, 0.5, 50);
        Tea blackTea = new Tea("Чай черный", 95, 0.5, 50);
        Tea greenTea = new Tea("Чай зелёный", 105, 0.5, 50);

        SoftTots smallTeddyBear = new SoftTots("Плюшевый мишка", 500);
        SoftTots bigTeddyBear = new SoftTots("Плюшевый мишка", 1000);
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

        OrderController orderController = new OrderController(orderServices);
        orderController.doOrder(automat);
    }
}
