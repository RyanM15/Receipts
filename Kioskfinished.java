import java.util.Scanner;
public class Kiosk{ //user interface
    public static int numApples;
    Printer reciept = new Printer();
    public static void Kiosk(){
    
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


public class Printer{
    //Kiosk kiosk = new Kiosk();
    System.out.print("Thank you for shopping at Ryan's Kiosk");
    int numAp = Kiosk.numApples
    Kiosk(numSteak);
    Kiosk(numSoda);
    Kiosk(numCereal);
    Kiosk(numBread);
    Kiosk(appleP);
    Kiosk(steakP);
    Kiosk(sodaP);
    Kiosk(cerealP);
    Kiosk(breadP);

    if (numApples > 0)
    {
        System.out.print(numApples + "\t apple \t" + appleP); //need to fix so space even

    }
    else
    {
        System.out.print("");
    }
    if (numSteaks > 0)
    {
        System.out.print(numSteak + "\t steaks \t" + steakP); //need to fix so space even

    }
    else
    {
        System.out.print("");
    }
    if (numSoda > 0)
    {
        System.out.print(numSoda + "\t soda \t" + sodaP); //need to fix so space even

    }
    else
    {
        System.out.print("");
    }
    if (numCereal > 0)
    {
        System.out.print(numCereal + "\t cereal \t" + cerealP); //need to fix so space even

    }
    else
    {
        System.out.print("");
    }
    if (numBread > 0)
    {
        System.out.print(numBread + "\t bread \t" + breadP); //need to fix so space even

    }
    else
    {
        System.out.print("");
    }
}


