package burr;

/**
 * A Cruise, which has a cost, so is an expense
 */
public class Cruise implements Expense {

  private Destination destination;

  /**
   * Creates a new Cruise to the specified destination.
   * @param destination Where are you crusing to?
   */
  public Cruise(Destination destination) {
    this.destination = destination;
  }

  /**
   * Returns the cost of the Cruise, based on its
   * Destination.
   *
   * @return Cost of the Cruise
   */
  @Override
  public float getCost() {
    switch (destination) {
      case Mexico:
        return 1000.0F;
      case Europe:
        return 2000.0F;
      case Japan:
        return 3000.0F;
      default:
        // It it's an unknown Destination, we don't have a known cost
        return 0.0F;
    }
  }


}
