import java.util.*;

public class Olympics {

    // Example of a class structor
    /*
    Olympics(){
        
    }
    */ 

	public static void main(String[] args) {

        //Loop over 10 numbers
        for (int i = 1; i < 11; i++){
            System.out.println("Number is " + i);
        }

        // You can also create a "For each loop" as shown in line 29

		//Some Olympic sports 

        // Note that ArrayList<xxxx> could be an array of integers (Array<Integer>), Array of characters (Array<Char>)
        ArrayList<String> olympicSports = new ArrayList<String>();
        
        // The .add(index, value) method adds an element to an array at the specified index
		olympicSports.add("Archery");
		olympicSports.add("Boxing");
		olympicSports.add("Cricket");
        olympicSports.add("Diving");

        // The .size() method returns the size of the array
        // olympicSports.get(0) would return the first element of the array 
		System.out.println("There are " + olympicSports.size() + " Olympic sports in this list. They are: ");

		for (String sport: olympicSports) {
			System.out.println(sport);
		}

		//Host cities and the year they hosted the summer Olympics
		HashMap<String, Integer> hostCities = new HashMap<String, Integer>();

		hostCities.put("Beijing", 2008);
		hostCities.put("London", 2012);
		hostCities.put("Rio de Janeiro", 2016);

		for (String city: hostCities.keySet()) {
			
			if (hostCities.get(city) < 2016) {

				System.out.println(city + " hosted the summer Olympics in " + hostCities.get(city) + ".");

			} else {

				System.out.println(city + " will host the summer Olympics in " + hostCities.get(city) + ".");

			}
		}

	}

}