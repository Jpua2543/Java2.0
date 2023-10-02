import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {

    public static void main(String[] args) {
        Cafe myCafe = new Cafe();

        System.out.println("Streak Goal: " + myCafe.getStreakGoal());

        double[] sampleOrder = {2.5, 3.5, 4.5, 5.5};
        System.out.println("Order Total: $" + myCafe.getOrderTotal(sampleOrder));

        ArrayList<String> menuList = new ArrayList<>(Arrays.asList("drip coffee", "cappuccino", "latte", "mocha"));
        myCafe.displayMenu(menuList);

        ArrayList<String> customerList = new ArrayList<>();
        myCafe.addCustomer(customerList);

        myCafe.printPriceChart("Coffee", 2.5, 5);
        myCafe.printPriceChartWithDiscount("Discounted Coffee", 2.5, 5);

        ArrayList<Double> priceList = new ArrayList<>(Arrays.asList(2.5, 3.5, 4.5, 5.5));
        myCafe.displayMenuWithPrices(menuList, priceList);
    }
}
