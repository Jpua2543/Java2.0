import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {

    public static void main(String[] args) {
        Cafe cafe = new Cafe();

        // Test getStreakGoal()
        System.out.println(cafe.getStreakGoal()); // Expected: 55
        System.out.println(cafe.getStreakGoal(5)); // Ninja Bonus, Expected: 15

        // Test getOrderTotal()
        double[] order = {2.5, 3.5, 4.5, 5.5};
        System.out.println(cafe.getOrderTotal(order)); // Expected: 16.0

        // Test displayMenu()
        ArrayList<String> menu = new ArrayList<>(Arrays.asList("drip coffee", "cappuccino", "latte", "mocha"));
        cafe.displayMenu(menu);

        // Test addCustomer()
        ArrayList<String> customers = new ArrayList<>();
        cafe.addCustomer(customers);

        // Test printPriceChart()
        cafe.printPriceChart("Coffee", 2.5, 5);

        // Test printPriceChartWithDiscount()
        cafe.printPriceChartWithDiscount("Discounted Coffee", 2.5, 5);

        // Test displayMenu() with prices
        ArrayList<Double> prices = new ArrayList<>(Arrays.asList(2.5, 3.5, 4.5, 5.5));
        cafe.displayMenu(menu, prices);

        // Test addCustomers() - Adds multiple customers until 'q' is pressed
        ArrayList<String> multipleCustomers = new ArrayList<>();
        cafe.addCustomers(multipleCustomers);

        // Note: For the addCustomer() and addCustomers() tests, when running outside of an IDE (like in the terminal/command prompt), the user input should work. However, in many IDEs, System.console().readLine() may not work directly. It's better to use a Scanner object for IDEs.
    }
}
