package lab2;

/**
 * A RabbitModel is used to simulate the growth
 * of a population of rabbits. 
 */
public class RabbitModel
{

  /**
   * Constructs a new RabbitModel.
   */

    private int population;
    private int lastYear = 1;
    private int yearBeforeLast = 0;

  public RabbitModel()
  {

    population = 0;

  }  
 
  /**
   * Returns the current number of rabbits.
   * @return
   *   current rabbit population
   */
  public int getPopulation()
  {
    return population;
  }
  
  /**
   * Updates the population to simulate the
   * passing of one year.
   */
  public void simulateYear()
  {

    population = lastYear + yearBeforeLast;
    yearBeforeLast = lastYear;
    lastYear = population;

  }
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {

    population = 0;

  }
}
