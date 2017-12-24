package datastructure;
import databases.ConnectDB;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */


		/* declare HashMap */
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		/*Adding elements to HashMap*/
		hmap.put(1, "Ahmed");
		hmap.put(2, "Payer");
		hmap.put(3, "Mafi");
		hmap.put(7, "Fahim");
		hmap.put(10, "Sayed");

		/* Retrieve values */
		String var = hmap.get(2);
		System.out.println("Value at index 2 is: " + var);
		String var1 = hmap.get(3);
		System.out.println("Value at index 3 is: " + var1);

		// Add List<String> into a Map.
		Map<String, List<String>> list = new HashMap<String, List<String>>();
		List<String> carList = new ArrayList<String>();
		carList.add("Honda");
		carList.add("Toyota");
		carList.add("Nissan");
		list.put("car", carList);
		System.out.println(list);

		List<String> grocery = new ArrayList<String>();
		grocery.add("Potato");
		grocery.add("Onion");
		grocery.add("Garlic");
		list.put("GROCERY", grocery);
		System.out.println(list);

		// Each loop to retrieve data
		for (Object str : list.keySet()) {
			System.out.println("KeySet:" + str);
			for (String str1 : list.get(str)) {
				System.out.println("Value: " + str1);
			}
		}
		// while loop with Iterator to retrieve data
		Iterator itr = list.entrySet().iterator();
		System.out.println("While Loop:");
		Iterator iterator = list.keySet().iterator();
		while (iterator.hasNext()) {
			Object kvalues = iterator.next();
			for (String str1 : list.get(kvalues)) {
				System.out.println("Value: " + str1);
			}
		}

		/*

		//Connect to MySql Database
		ConnectDB connectDB = new ConnectDB();

		//Create table in the database
		connectDB.createTableFromStringToMySql("use_map", "mapKey", "mapValue");
		for (Object str : list.keySet()) {
			for (String str1 : list.get(str)) {
				List<String> list1 = new ArrayList<String>();
				list1.add(str.toString()); // adds key
				list1.add(str1); // adds value
				// Insert data in the database
				connectDB.InsertDataFromArrayListToMySql(list1, "use_map", "mapKey", "mapValue");
			}
		}
		System.out.println("Reading data from database: ");
		//Reading data from database
		List<String> numbers = connectDB.readDataBase("use_map", "mapKey", "mapValue");
		for (String st : numbers) {
			System.out.println(st);
		}

		*/

	}

}
