package burr;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver class
 *
 * @author Matthew Burr
 * @version 2.0
 * @since 2017.04.22
 */
public class VacationCalculator {

  public static void main(String[] args) {

    VacationCalculator vc = new VacationCalculator();

    // Calculate and some vacation costs
    int days = 5;
    vc.displayVacationCost(Destination.Japan, days);
    vc.displayVacationCost(Destination.Europe, days);
    vc.displayVacationCost(Destination.Mexico, days);
  }

  /**
   * Calculates the total cost for vacactioning at a given location for
   * a specific number of days
   * @param dest the destination of the vacation
   * @param days the number of days for the trip
   * @return the total cost of the vacation
   */
  private float calculateVacationCost(Destination dest, int days) {

    // Create an ArrayList of expenses and populate it
    ArrayList<Expense> expenses = new ArrayList<>();
    expenses.add(new Cruise(dest));
    expenses.add(new Lodging(dest, days));
    expenses.add(new Dining(dest, days));

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

  /**
   * Displays the total cost for a vacation to a given destination for a given number of days
   * @param dest the destination visited
   * @param days the duration of the trip, in days
   */
  private void displayVacationCost(Destination dest, int days) {
    System.out.format("The total cost of %d days in %s is $%.2f%n",
        days, dest.name(), calculateVacationCost(dest, days));
  }
}
