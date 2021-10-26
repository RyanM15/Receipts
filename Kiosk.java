
import java.util.Scanner;
public class Kiosk{ //user interface
    public static int numApples;
    
    public static void main(String[] args){
    
Scanner scan = new Scanner (System.in);
System.out.print("Hello and welcome to my kiosk");
System.out.println("\nFor sale today we have 5 items");
int numApples = 0;
int numSteak = 0;
int numSoda = 0;
int numCereal = 0;
int numBread = 0;



System.out.println("\nWe have delicious gala apples for $1. Would you like some?");
String buy = scan.nextLine();


if (buy.equals("Yes"))
{
    System.out.print("Ok, how many would you like?  ");
    numApples = scan.nextInt();
   String temp = scan.nextLine();
}
else
{
    System.out.print("Ok. Next item");
}

System.out.println("\nWe have some juicy t-bone steaks for $9. Would you like some?");
String buyTwo = scan.nextLine();
if (buyTwo.equals("Yes"))
{
    System.out.print("Ok, how many would you like?  ");
    numSteak = scan.nextInt();
    String temp = scan.nextLine();
}
else
{
    System.out.print("Ok. Next item");
}

System.out.println("\nWe have refreshing soda for $2. Would you like some?");
String buyThree = scan.nextLine();
if (buyThree.equals("Yes"))
{
    System.out.print("Ok, how many would you like?  ");
    numSoda = scan.nextInt();
    String temp = scan.nextLine();
}
else
{
    System.out.print("Ok. Next item");
}

System.out.println("\nWe have cereal for $3. Would you like some?");
String buyF = scan.nextLine();
if (buyF.equals("Yes"))
{
    System.out.print("Ok, how many would you like?  ");
    numCereal= scan.nextInt();
    String temp = scan.nextLine();
}
else
{
    System.out.print("Ok. Next item");
}

System.out.println("\nWe have bread for $5. Would you like some?");
String buyFive = scan.nextLine();
if (buyFive.equals("Yes"))
{
    System.out.print("Ok, how many would you like?  ");
    numBread = scan.nextInt();
    String temp = scan.nextLine();
}
else
{
    System.out.print("Ok. On to checkout");
}
Printer receipt = new Printer(numApples, numSteak, numSoda, numCereal, numBread);
receipt.Checkout();
}
}
