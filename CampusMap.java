
/**
* This file contains the data for theCampus Map file 
* @author  Jordan Cruser, edited by Priscilla Trejo
* @since  2022-11-1
*/


import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building...");
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

//Here I've added 10 more locations on campus for our map
    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));
        myMap.addBuilding(new Building("Center Campus", "100 Elm St, MA 01063", 3));
        myMap.addBuilding(new Building("Hatfield Hall", "Hatfield Hall, MA 01063", 3));
        myMap.addBuilding(new Building("Museum of Art", "20 Elm St, MA 01063", 4));
        myMap.addBuilding(new Building("Nielson Library", "7 Neilson Drive, MA 01063", 4));
        myMap.addBuilding(new Building("Ford Hall", "100 Green St, MA 01063", 4));
        myMap.addBuilding(new Building("Dewey Hall", "Neilson Drive, MA 01063", 4));
        myMap.addBuilding(new Building("Burton Hall", "46 College Ln, MA 01063", 4));
        myMap.addBuilding(new Building("JMG", "60 Elm St, MA 01063", 2));
        myMap.addBuilding(new Building("Wright Hall", "5 Chapin Way, MA 01063", 2));
        myMap.addBuilding(new Building("Clark Hall", "Clark Hall, MA 01063", 3));
        System.out.println(myMap);
    }
    
}
