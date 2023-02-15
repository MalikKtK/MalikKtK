package coinfun;

import java.util.Random;

public class Coin {
  private CoinValue value;

  public Coin() {
    flip();
  }

  public CoinValue getValue() {
    return value;
  }

  public void flip() {
    Random random = new Random();
    boolean value = random.nextBoolean();

    /*
    if (value == true)
      this.value = CoinValue.HEADS;
    else
      this.value = CoinValue.TAILS;
     */

    //           ( if )? (    true)      : (    false     )
    this.value = value ? CoinValue.HEADS : CoinValue.TAILS;
  }
}
