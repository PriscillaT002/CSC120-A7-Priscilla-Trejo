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

    //This method allows us to subtract the amount of coffee, sugar, and cream the user would like from our current inventory
    public void sellCoffee(int pCoffee, int pSugar, int pCream) {

        nCoffeeOunces -= pCoffee;
        nSugarPackets -= pSugar;
        nCreams -= pCream;

    }
        /*Overloads the sellCoffee method. Divides our left over */
    public void sellCoffee(int lCoffee, int lSugar, int lCream){
        nCoffeeOunces -= lCoffee /2 ;
        nSugarPackets -= lSugar /2 ;
        nCreams -= lCream /2 ;
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
  