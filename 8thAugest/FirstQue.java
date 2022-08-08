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
