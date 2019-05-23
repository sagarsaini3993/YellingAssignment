
public class Yelling {
	
	public String Scream(String name) {
		
		// Test Case When name is null
		if (name == null) {
			return "Nobody is yelling";
		}
		
		// Test Case when name is in uppercase
		
		if (name == name.toUpperCase()) {
			return name+" IS YELLING";
		}
		return name+" is yelling";
	}

}
