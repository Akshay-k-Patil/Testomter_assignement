package stringMethods;

public class UpperToLowerConversion {

	public static void main(String[] args) {
		String inputstring = "AbC#$dEf";
		System.out.println(converUpperTolowserConversion(inputstring));		

	}
	
	public static String converUpperTolowserConversion(String inputstring){
		String results="";
		
		for(int i= 0; i < inputstring.length(); i++){
			
			char st = inputstring.charAt(i);
			if(Character.isLowerCase(st)) {
				results = results + Character.toUpperCase(st);
			}else if (Character.isUpperCase(st)) {
				results = results + Character.toLowerCase(st);				
			}else {
				results = results + st;
			}
		}
		return results;
	}
}
