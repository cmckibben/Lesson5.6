public class Pokemon {
  //Data members
  private double catchRate=1;
  private double attackPower=1;
  private int weight=1;
  private int level=1;
  private String cry="POKEMON";

  //Constructors
  public Pokemon() {
    catchRate   = 1;
    attackPower = 100;
    weight      = 100;
    level       = 1;
    cry         = "POKEMON";
  }

  /**
  * Creates a Pokemon with weight w and level lev
  * @param w   the desired weight of the Pokemon
  * @param lev the desired level of the Pokemon
  * @param cat the desired catch rate of the Pokemon
  * @param pow the desired attack power of the Pokemon
  */
  public Pokemon(int w, int lev, double cat, double pow) {
  }

  @Override
  public String toString() {
      String output ="";
      output += "Catchrate = " + catchRate;
      output += "\nAttackPower = " + attackPower;
      output += "\nweight = " + weight;
      output += "\nlevel = " + level;
      output += "\ncry = \"" + cry +"\"";
      return output;
  }

  //Methods for lesson 2.3
  /** Causes a pokemon to gain 5% weight */
  public void gainWeight() {
    weight *= 1.05; //has the Pokemon get 5% heavier
  }
  //Methods for lesson 2.4
  /**
  * sets the weight of the pokemon. Should be a positive number
  * @param w   the desired weight of the Pokemon
  */
  public void setWeight(int w) {
    weight = w;
  }

  //Methods for lesson 2.4
  /** Gets the current weight of the Pokemon
  * @return weight
  */
    public int getWeight() {
        return weight;
    }
}