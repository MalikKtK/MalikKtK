import java.util.Scanner;

public class TouchGrass {
  private final Scanner scanner = new Scanner(System.in);

  public void grassPrompt() {
    do {
      System.out.println("current grass height?");
      double currentGrassHeight = scanner.nextDouble();
  
      System.out.println("max grass height?");
      double maxGrassHeight = scanner.nextDouble();
      
      System.out.printf("there are %s days until the grass has to be cut%n",
          Math.ceil((maxGrassHeight - currentGrassHeight)/0.8));
      
    } while (true);
  }
  
  public static void main(String[] args) {
    new TouchGrass().grassPrompt();
  }
}
  
