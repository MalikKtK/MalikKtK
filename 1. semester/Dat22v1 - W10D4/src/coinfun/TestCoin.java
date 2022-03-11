package coinfun;

public class TestCoin {
  public static void main(String[] args) {
    int headsCount = 0, tailsCount = 0;

    for (int i = 0; i < 10000; i++) {
      Coin coin = new Coin();
      System.out.println(coin.getValue());
      if (coin.getValue() == CoinValue.HEADS)
        headsCount++;
      else
        tailsCount++;
    }

    System.out.println("\nTOTAL:");
    System.out.println("Heads: " + headsCount);
    System.out.println("Tails: " + tailsCount);
  }
}
