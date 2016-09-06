import java.io.Console;

public class TravelCost {
  public static void main(String[] args) {
    Console myConsole = System.console();
    Integer weightCost = askForTravelDetail("weight");
    askForTravelDetail("distance to travel");
    Integer distanceToTravel = Integer.parseInt(myConsole.readLine());
    askForTravelDetail("price modifier");
    Integer priceModifier = Integer.parseInt(myConsole.readLine());

    Integer totalPrice = ( packageWeight / 10 ) + ( distanceToTravel / 5 ) * priceModifier;
    System.out.println("Your Total price is : $" + totalPrice);
  }

  public static Integer askForTravelDetail(String shipping ) {

    System.out.println("What is the " + shipping + "?");
    return readLine;
    //Integer shipping = Integer.parseInt(System.console());
  }
}
