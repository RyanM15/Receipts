public class Printer{
    //Kiosk kiosk = new Kiosk();
    
    int numApples = 0;
	int numSteak = 0;
	int numSoda = 0;
	int numCereal = 0;
	int numBread = 0;

    
    
    
    
    
    public Printer(int numA, int numSt, int numSo, int numC, int numB){
		numApples = numA;
		numSteak = numSt;
		numSoda = numSo;
        numCereal = numC;	
        numBread = numB;
	}
    
   
   
   
   
   
   
    int appleP = 1;
	int steakP = 9;
	int sodaP = 2;
	int cerealP = 3;
	int breadP = 5;
    double tax = 0;
    double total = 0;
    double subTotal = 0;
    public void Checkout(){
		
    System.out.print("\n\n\n****************************************");
    System.out.print("\nThank you for shopping at Ryan's Kiosk!\n");
    if (numApples > 0)
    {
        System.out.println("\n " + numApples + " apple      \t" + "$" +appleP); //need to fix so space even

    }
    else
    {
        System.out.print("");
    }
    if (numSteak > 0)
    {
        System.out.println(" " + numSteak + " steaks \t" + "$" +steakP); //need to fix so space even

    }
    else
    {
        System.out.print("");
    }
    if (numSoda > 0)
    {
        System.out.println(" " + numSoda + " soda      \t" + "$" +sodaP); //need to fix so space even

    }
    else
    {
        System.out.print("");
    }
    if (numCereal > 0)
    {
        System.out.println(" " + numCereal + " cereal \t" + "$" +cerealP); //need to fix so space even

    }
    else
    {
        System.out.print("");
    }
    if (numBread > 0)
    {
        System.out.println(" " + numBread + " bread      \t" + "$" +breadP); //need to fix so space even

    }
    else
    {
        System.out.print("");
    }
    tax = ((numApples * appleP) + (numSteak * steakP) + (numSoda * sodaP) + (numCereal * cerealP) + (numBread * breadP)) * 0.07;
    total = ((numApples * appleP) + (numSteak * steakP) + (numSoda * sodaP) + (numCereal * cerealP) + (numBread * breadP)) + tax;
    subTotal = (numApples * appleP) + (numSteak * steakP) + (numSoda * sodaP) + (numCereal * cerealP) + (numBread * breadP);
    System.out.println("\nSubtotal:\t$" + String.format("%.2f" , subTotal));
    System.out.println("Tax:        \t$" + String.format("%.2f" , tax));
    System.out.println("Total:      \t$" + String.format("%.2f" , total));
    System.out.print("****************************************\n");
}
}




