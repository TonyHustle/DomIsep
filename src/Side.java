

/**
 * Class Side
 */
public class Side {

  //
  // Fields
  //

  private String type;
  private int crowns;
  
  //
  // Constructors
  //
  public Side () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of type
   * @param newVar the new value of type
   */
  private void setType (String newVar) {
    type = newVar;
  }

  /**
   * Get the value of type
   * @return the value of type
   */
  private String getType () {
    return type;
  }

  /**
   * Set the value of crowns
   * @param newVar the new value of crowns
   */
  private void setCrowns (int newVar) {
    crowns = newVar;
  }

  /**
   * Get the value of crowns
   * @return the value of crowns
   */
  private int getCrowns () {
    return crowns;
  }

  //
  // Other methods
  //

  /**
   * @param        type
   * @param        crowns
   */
  public void Side(String type, int crowns)
  {
  }


}
