package sharma.hackerrank;

public class Main {

    public static void main(String[] args) {
        mealTotalCost(12.00, 20, 8);
    }

    public static void mealTotalCost(double meal_cost, int tip_percent, int tax_percent){
            double tip = meal_cost * ((double)tip_percent/100);
            double tax = meal_cost * ((double)tax_percent/100);
            double totalCost = tip + tax + meal_cost;
            System.out.println(Math.round(totalCost));
    }
}
