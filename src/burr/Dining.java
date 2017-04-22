package burr;

/**
 * Dining expenses
 * @author Matthew Burr
 * @version 1.0
 * @since 2017.04.22
 */
public class Dining implements Expense {

  private Destination destination;
  private int days;

  /**
   * Creates a new instance of Dining expenses
   * @param dest the destination of the trip
   * @param days the duration of the trip in days
   */
  Dining(Destination dest, int days) {

    this.destination = dest;
    this.days = days;
  }

  /**
   * The cost of dining for the trip
   * @return the cost of dining
   */
  @Override
  public float getCost() {

    // Figure out our daily cost
    float dailyCost = 0.0F;

    switch (destination) {
      case Mexico:
        dailyCost = 10.00F;
        break;
      case Europe:
        dailyCost = 20.00F;
        break;
      case Japan:
        dailyCost = 30.00F;
        break;
      default:
          // There is no default cost
    }

    return dailyCost * days;
  }
}
