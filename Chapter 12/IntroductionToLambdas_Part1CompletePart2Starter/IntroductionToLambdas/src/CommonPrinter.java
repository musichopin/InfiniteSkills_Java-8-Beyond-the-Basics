
public class CommonPrinter 
{
	//create static runnable here:
	public static Runnable r1 = () -> System.out.println("This is my first functional expression!");
	
	//define an interface for the FormatString signature
	interface FormatString { String format(String value); }
	//create an expression of the interface type
	public static FormatString fs = (String value) -> {
		return "From my first functional service: " + value;
	};
	
	//define an interface for the Console PrintObject

	//create the printobject for any object using type inference

}
