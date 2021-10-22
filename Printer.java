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
    
    
    public void Checkout(){
		
    System.out.print("\nThank you for shopping at Ryan's Kiosk!");
    if (numApples > 0)
    {
        System.out.println("\n" + numApples + "\t apple      \t" + "$" +appleP); //need to fix so space even

    }
    else
    {
        System.out.print("");
    }
    if (numSteak > 0)
    {
        System.out.println(numSteak + "\t steaks \t" + "$" +steakP); //need to fix so space even

    }
    else
    {
        System.out.print("");
    }
    if (numSoda > 0)
    {
        System.out.println(numSoda + "\t soda      \t" + "$" +sodaP); //need to fix so space even

    }
    else
    {
        System.out.print("");
    }
    if (numCereal > 0)
    {
        System.out.println(numCereal + "\t cereal \t" + "$" +cerealP); //need to fix so space even

    }
    else
    {
        System.out.print("");
    }
    if (numBread > 0)
    {
        System.out.println(numBread + "\t bread      \t" + "$" +breadP); //need to fix so space even

    }
    else
    {
        System.out.print("");
    }
    
}
}




