/*
	1. Develop a java class with a instance variable M1 (HashMap) create a method saveCountryCapital(String CountryName, String capital) , the method should add the passed country and capital as key/value in the map M1 and return the Map (M1).
	Key- Country Value - Capital
	India Delhi
	Japan Tokyo
	2. Develop a method getCapital(String CountryName) which returns the capital for the country passed, from the Map M1 created in step 1.
	3. Develop a method getCountry(String capitalName) which returns the country for the capital name, passed from the Map M1 created in step 1.
	4. Develop a method which iterates through the map M1 and creates another map M2 with Capital as the key and value as Country and returns the Map M2.
	Key – Capital Value – Country
	Delhi India
	Tokyo Japan
	5. Develop a method which iterates through the map M1 and creates an ArrayList with all the Country names stored as keys. This method should return the ArrayList.
	NOTE: You can test the methods using a main method.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class FirstQue {
	
	Map<String,String> M1 = new HashMap<>();
	
	
	//saveCountryCapital method to save the key and values
	public Map<String,String> saveCountryCapital(String CountryName, String capital) {
		M1.put(CountryName,capital);
		
		return M1;
	}
	
	
	//Second Method
	String getCapital(String countryName)
	{	
		for(Map.Entry<String, String> entry : M1.entrySet())
		{
			if(countryName.equals(entry.getKey())) {
				return entry.getValue();
			}
		}
		return null;
	}

	
	//Third Method
	String getCountry(String capitalName) 
	{
		for(Map.Entry<String, String> entry : M1.entrySet())
		{
			if(capitalName.equals(entry.getValue())) {
				return entry.getKey();
			}
		}
		return null;
	}
	
	
	//Fourth Method
	public Map<String,String> inverseMap()
	{
		Map<String,String> second = new HashMap<>();
		
		for(Map.Entry<String, String> entry : M1.entrySet()) 
		{
			second.put(entry.getValue(), entry.getKey());
		}
		
		return second;
	}
	
	
	//Fifth Method
	public ArrayList<String> arrKey()
	{
		Set<String> keySet = M1.keySet();
		ArrayList<String> list = new ArrayList<String>(keySet);
		
		return list;
	}
	
	
	
	public static void main(String[] args) {
		
		FirstQue fq = new FirstQue();
		
		//to save keys and values
		fq.saveCountryCapital("India", "Delhi");
		fq.saveCountryCapital("Japan", "Tokyo");
		
		System.out.println("Calling getCapital which returns value for coreesponding key : "+fq.getCapital("India"));
		
		System.out.println("Calling getCountry which returns key for coreesponding Value : "+fq.getCountry("Tokyo"));
		
		System.out.println("Fourth method for storing map : "+fq.inverseMap());
		
		System.out.println("Fifth Method using ArrayList : "+fq.arrKey());

	}

}
