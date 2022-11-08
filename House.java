/* This is a stub for the House class */

/**
* This file contains the data for the extended House class from our building file
* @author  Jordan Cruser, edited by Priscilla Trejo
* @since  2022-11-1
*/

import java.util.ArrayList;


public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningHall;
  public int nResidents;
  public boolean hasElevator;

  public House(String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningHall = true;
    System.out.println("You have built a house: 🏠");
  }

  //this is a boolean method that givens us true or false depnding on whether or not a house has a dining hall
  public boolean hasDiningHall(){
    if (hasDiningHall == true) {
      System.out.println("There is a dining hall in this house.");
    }
    else{
      System.out.println("There is no dining hall in this house");
    }

    return hasDiningHall;
    }


  //This method adds the names of new residents who move in
  public static void moveIn(String name) {
    ArrayList<String> residents = new ArrayList<String>();
    residents.add(name);

 /*Overloads the moveIn method. Removes name from to moveIn just in case the resident decides to leave. */
 public String moveIn(){
    residents.remove(name);

      }


 
  }
 //This method keeps tracks of the name's of residents who move out
  public String moveOut(String name){
    ArrayList<String> residents = new ArrayList<String>();
    residents.remove(name);

    return name;

  }

/*Overloads the moveOut method. Adds name back to moveOut just in case the resident decides to stay. */
    public void moveOut(){
    residents.add(name);
      }
      
//This method checks to make sure the person is a resident of the building
  public boolean isResident(String person){

      // Creating a Boolean array
      ArrayList<String> residents = new ArrayList<String>();

     
      // Using Booleans.contains() method to search
      // for an element in the array. The method
      // returns true if element is found, else
      // returns false
      if (residents.contains(person))
          System.out.println("Yes, person is a resident");
      else
          System.out.println("No, person is not a resident");

        return false;
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

  public void showOptions() {
    System.out.println("Available options at " + "This House" + ":\n + hasDiningHall() \n + moveIn() \n + moveOut() \n + Isresident() \n");
}



 public static void main(String[] args) {
  new House();
}

}