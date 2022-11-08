
/* This is a stub for the Library class */
/**
* This file contains the data for the extended library class from our building file
* @author  Jordan Cruser, edited by Priscilla Trejo
* @since  2022-11-1
*/

// This import still seems to work even though It has red squiggles
import java.util.Hashtable

public class Library extends Building{
  Hashtable<String, Boolean> newLibrary;
  public boolean hasElevator;

  public Library(String name, String address, int nFloors, String title, Boolean have) {
    super(name,address,nFloors);

    //Below I am initializing an empty hashtable for our library

    Hashtable<String, Boolean> newLibrary = new Hashtable<String, Boolean>();

    System.out.println("You have built a library: 📖")
  }

  //For this method I kept it simple and used .put so that we can add a new title to our library 
  public void addTitle(String title, Boolean have) {

    newLibrary.put(title, have);

  }

      /*Overloads the addTitle method. Clears out the entire collection in the case that the library is permanently closed. */
      public void addTitle(){
        newLibrary.clear();
      }


  //For this method I used oracle to look for somthing that would allow me to remove a title so that is why I chose .remove
  public String removeTitle(String title, Boolean have){

    newLibrary.remove(title, have);

    return title;
  }

    /*Overloads the removeTitle method. Clears out the entire collection in the case that the library is permanently closed. */
    public void removeTitle(){
        newLibrary.clear();
      }


  //For checkout I was a bit confused on what was being asked so I decided to go ahead set it up so that the user can enter a title, remove that book. We then will get an output to the console stating that the tile had been checked out
  public void checkOut(String title, Boolean have){

   newLibrary.remove(title, have);

    if (have == true) {
      System.out.println(newLibrary.get(have) + "This book is currently checked out"); }
  }


  //I did the same here as I did for the method above but I reversed it to .put to add a book back to the library
  public void returnBook(String title, Boolean have) {

    newLibrary.put(title, have);

  if (have == true) {
    System.out.println(newLibrary.get(have) + "This book is currently available"); }

  }

  // returns true if the title appears as a key in the Libary's collection, false otherwise
  public boolean containsTitle(String title, Boolean have){
    if (have == true) {
      return true;
    }
    else{
      return false;
    }
  }


  // returns true if the title is currently available, false otherwise
  public boolean isAvailable(String title, Boolean have){
    if (have == true) {
      return true;
      System.out.println("This title is currently available");
    }
    else{
      return false;
    }

  }


  //Overrides goToFloor method from Building class
  @Override
  public void goToFloor(int floorNum){
super.goToFloor(floorNum);
if (hasElevator == true){
    System.out.println("Taking the elevator...");
    super.goToFloor(floorNum);}
else{
    System.out.println("There is not an elevator in this library");
}
  }

  // prints out the entire collection in an easy-to-read way (including checkout status)
  // I wasn't too sure how to seperate the data without it not matching up anymore so I tried to implement the simplest type or "ASCII" art that we learned a while back to give the data a type of border.

  public void printCollection(){

    System.out.println("------------------------------------");
    System.out.println(newLibrary);
    System.out.println("------------------------------------");
  }

  public void showOptions() {
    System.out.println("Available options at " + "This Library Collection "+ ":\n + addTitle() \n + removeTitle() \n + checkOut() \n + returnBook()\n + containsTitle()\n + isAvailable()\n +printCollection()\n ");
}

  public static void main(String[] args) {
    new Library();
  }

}