package burr;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver class
 *
 * @author Matthew Burr
 * @version 1.0
 * @since 2017.04.22
 */
public class VacationCalculator {

  public static void main(String[] args) {

    VacationCalculator vc = new VacationCalculator();

    // Calculate some vacaction costs
    float japanCost = vc.calculateVacationCost(Destination.Japan);

    // Print the cost...
    System.out.format("The total cost for the trip to Japan is $%.2f", japanCost);
  }

  /**
   * Calculates the total cost for vacactioning at a given location for
   * a specific number of nights
   * @param dest the destination of the vacation
   * @return the total cost of the vacation
   */
  private float calculateVacationCost(Destination dest) {

    // Create an ArrayList of expenses and populate it
    ArrayList<Expense> expenses = new ArrayList<>();
    expenses.add(new Cruise(dest));

    // Return a tally of the expenses
    return tallyExpenses(expenses);
  }

  /**
   * An internal method used by VacationCalculator to loop through
   * a List of items that implement the Expense interface and
   * determine their cost
   *
   * @param  expenses A list of items that implement the Expense interface
   * @return          the total cost calculated by the items
   */
  private float tallyExpenses(List<Expense> expenses) {

    float totalCost = 0.0F;

    // Loop through the expenses and add each one to the total
    for (Expense exp : expenses) {
      totalCost += exp.getCost();
    }

    return totalCost;
  }
}
