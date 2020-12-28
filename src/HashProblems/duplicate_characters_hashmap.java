package HashProblems;

import java.util.*;

public class duplicate_characters_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		printdups_map(str);

	}
	// time complexity O(n)
	/*
	 * containsKey()The java.util.HashMap.containsKey() method is used to check whether a particular key is being mapped into the HashMap or not. 
	 * It takes the key element as a parameter and returns True if that element is mapped in the map.
	 * 
	 * The java.util.HashMap.get() method of HashMap class is used to retrieve or fetch the value mapped by a particular key mentioned in the parameter. 
	 * It returns NULL when the map contains no such mapping for the key
	 * 
	 * The java.util.HashMap.entrySet() method in Java is used to create a set out of the same elements contained in the hash map. 
	 * It basically returns a set view of the hash map or we can create a new set and store the map elements into them
	 * 
	 * The Map.Entry interface enables you to work with a map entry.
       The entrySet( ) method declared by the Map interface returns a Set containing the map entries. 
       Each of these set elements is a Map.Entry object
	 */
	
	public static void printdups_map(String str) {
		char ch[]=str.toCharArray();
		HashMap<Character,Integer> charset=new HashMap<Character,Integer>();
		for(Character c:ch) {
			if(charset.containsKey(c)) {        // duplicate key
				charset.put(c, charset.get(c)+1);
			}
			else {							//  not present in map						
				charset.put(c, 1);
			}
		}
		System.out.println("Actual word "+str);
		for(Map.Entry<Character, Integer> entry : charset.entrySet() ) {
			if (entry.getValue()>1) {
				System.out.println(entry.getKey()+"-"+entry.getValue());
			}
		}
	}
	
	
	

}
