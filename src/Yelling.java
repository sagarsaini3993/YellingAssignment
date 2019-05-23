import java.lang.reflect.Array;

public class Yelling {
	
	public String Scream(String[] name) {
		
		// Test Case When name is null
		if (name[0] == "") {
			return "Nobody is yelling";
		}
		
		// Test Case when name is in uppercase
		
		else if (name[0] == name[0].toUpperCase()) {
			return name[0]+" IS YELLING";
		}
		
		else if (name.length > 1) {
			return "Peter and Kadeem are yelling";
		}
		
		return name[0]+" is yelling";
	}

}
