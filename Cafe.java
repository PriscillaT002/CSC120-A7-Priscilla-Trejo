/* This is a stub for the Cafe class */

/**
* This file contains the data for the extended cafe class from our building file
* @author  Jordan Cruser, edited by Priscilla Trejo
* @since  2022-11-1
*/

public class Cafe extends Building{
    public int nCoffeeOunces;
    public int nSugarPackets;
    public int nCreams;
    public int nCups;
    public boolean hasElevator;
    
    //This here sets our coffee attibutes while also giving our inventory a starting number
    public Cafe(String name, String address, int nFloors, int coffee, int sugar, int cream, int cups) {
        super(name, address, nFloors);
        coffee = 50;
        sugar = 50;
        cream = 50;
        cups = 50;
        this.nCoffeeOunces = coffee;
        this.nSugarPackets = sugar;
        this.nCreams = cream;
        this.nCups = cups;


        System.out.println("You have built a cafe: ☕");
    }

     //Overrides goToFloor method from Building class
     @Override
     public void goToFloor(int floorNum){
   super.goToFloor(floorNum);
   if (hasElevator == true){
       System.out.println("Taking the elevator...");
       super.goToFloor(floorNum); }
   else{
       System.out.println("There is not an elevator in this library");
   }
     }

     //Overloads the cafe method. Instead of having 50 cups we have 100 cups

    public cafe(int cups){
       cups = 100;

       System.out.println("You have" + cups + "more cups");
          }



    //This method allows us to subtract the amount of coffee, sugar, and cream the user would like from our current inventory
    public void sellCoffee(int pCoffee, int pSugar, int pCream) {

        nCoffeeOunces -= pCoffee;
        nSugarPackets -= pSugar;
        nCreams -= pCream;

    }
        /*Overloads the sellCoffee method. Subtracts from our cup inventory rather than each ingredient for a cup of coffee*/
    public void sellCoffee(int pCups){
        nCups -= pCups ;
          }
    

    //This method adds more stock to our inventory when we reach 0 in stock for each item
        private void restock(int coffee, int sugar, int cream) {
            if (coffee == 0) {
                nCoffeeOunces += 50;}

            if (sugar == 0) {
                nSugarPackets += 50;}

            if  (cream == 0) {
                nCreams += 50 ;}

              } 

            public void showOptions() {
                System.out.println("Available options at " + "This coffee shop" + ":\n + sellCoffee() \n + restock() \n");
            }
        
             
        }
              public static void main(String[] args) {
                new Cafe();
              }
            
            }
  