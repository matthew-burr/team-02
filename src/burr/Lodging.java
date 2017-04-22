package burr;

/**
 * Lodging expenses for a trip
 * @author Matthew Burr
 * @version 1.0
 * @since 2017.04.22
 */
public class Lodging implements Expense {

  private Destination destination;
  private int days;

  /**
   * Creates a new Lodging instance
   * @param dest the destination where we stayed
   * @param days how long we stayed
   */
  Lodging(Destination dest, int days) {

    this.destination = dest;
    this.days = days;
  }

  /**
   * Gets the total cost of our lodging, based on how long we stayed
   * @return total lodging cost
   */
  @Override
  public float getCost() {

    // Figure out our daily cost
    float dailyCost = 0.0F;
    float surcharge = 0.0F;

    switch (destination) {
      case Mexico:
        dailyCost = 100.00F;
        break;
      case Europe:
        dailyCost = 200.00F;
        surcharge = 0.10F;
        break;
      case Japan:
        dailyCost = 300.00F;
        surcharge = 0.30F;
        break;
      default:
        // There is no default cost
    }

    return dailyCost * days * (1 + surcharge);
  }
}
