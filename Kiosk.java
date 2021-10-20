
import java.util.Scanner;
public class Kiosk{ //user interface
public static main void (String [args]){
Scanner scan = new Scanner (System.in);
System.out.print("Hello and welcome to my kiosk");
System.out.println("For sale today we have 5 items");
int numApples = 0;
int numSteak = 0;
int numSoda = 0;
int numCereal = 0;
int numBread = 0;

double appleP = 1.99;
double steakP = 9.99;
double sodaP = 2.99;
double cerealP = 3.99;
double breadP = 5.99;

System.out.println("We have delicious gala apples for $1.99. Would you like some?");
String buy = scan.nextLine();
if (buy.equals("Yes"))
{
    System.out.print("Ok, how many would you like?");
    numApples = scan.nextInt();
}
else
{
    System.out.print("Ok. Next item");
}

System.out.println("We have some juicy t-bone steaks for $9.99. Would you like some?");
String buyTwo = scan.nextLine();
if (buyTwo.equals("Yes"))
{
    System.out.print("Ok, how many would you like?");
    numSteak = scan.nextInt();
}
else
{
    System.out.print("Ok. Next item");
}

System.out.println("We have refreshing soda for $2.99. Would you like some?");
String buyThree = scan.nextLine();
if (buyThree.equals("Yes"))
{
    System.out.print("Ok, how many would you like?");
    numSoda = scan.nextInt();
}
else
{
    System.out.print("Ok. Next item");
}

System.out.println("We have cereal for $3.99. Would you like some?");
String buyF = scan.nextLine();
if (buyF.equals("Yes"))
{
    System.out.print("Ok, how many would you like?");
    numCereal= scan.nextInt();
}
else
{
    System.out.print("Ok. Next item");
}

System.out.println("We have bread for $5.99. Would you like some?");
String buyFive = scan.nextLine();
if (buyFive.equals("Yes"))
{
    System.out.print("Ok, how many would you like?");
    numBread = scan.nextInt();
}
else
{
    System.out.print("Ok. On to checkout");
}










    
}





















}
