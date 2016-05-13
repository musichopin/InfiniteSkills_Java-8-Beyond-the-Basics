import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

import CustomObjects.Person;


public class FunctionalInterfaces 
{

	public static void main(String[] args)
	{
		//a quick functional interface Function<T,R>
		//use Function<inputType, outputType> var = (inputType arg) -> { //return type expr };
		
		//create a Function that takes an object and returns a String
		
		//print some out
		/*
		System.out.println(myOTS.apply("Any Object works!"));
		System.out.println(myOTS.apply(50));
		System.out.println(myOTS.apply(true));
		System.out.println(myOTS.apply(new Person("John", "Smith", 48)));
		*/
		
		//another functional interface: Comparator
		//comparator [use type inference!]:
		
		/*
		CommonPrinter.po.printConsole(c.compare("Mike", "Marty"));
		CommonPrinter.po.printConsole(c.compare("Dan", "David"));
		CommonPrinter.po.printConsole(c.compare("John", "Andrew"));
		*/
		
		String one = "John";
		String two = "Andrew";
		
		//note: We get type inference on a and b:
		
		
		//and now check out binary function, which takes two arguments and returns a result
		
		
		//binary operator
		
		//look, we also have some type inference here:
		
		
		//now let's have some fun!
		//predicate
	
		//again, we can use type inference:
		
		//filter a collection
		List<Integer> productIDs = new ArrayList<Integer>(); 
		Random r = new Random(48915);
		for (int i = 0; i < 50; i++)
		{
			productIDs.add(r.nextInt(999999));
		}
		
		
	}
	
	/**
	 * Filter a list of items based on a predicate test.
	 * @param p the predicate expression
	 * @param items the list of items to filter
	 * @return a list containing only valid items
	 */
	public static <T> List<T> filterList(Predicate<T> p, List<T> items)
	{
		List<T> result = new ArrayList<T>();
		for (T data : items)
		{
			if (p.test(data)){
				result.add(data);
			}
		}
		return result;
	}
}
