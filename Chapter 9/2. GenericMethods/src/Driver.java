import java.util.Random;


public class Driver 
{
	private static int[] myInts;
	private static String[] myStrings;
	private static Animal[] myAnimals;
	private static final int SIZE = 10;
	
	public static void main(String[] args)
	{
//		reset etmemizin nedeni her random sonrasýný sýfýrlamak 
//		ve initialization için 
		resetInts(); 
		resetStrings();
		resetAnimals();
		
		// turn these on to see defaults before swapping:
//		printInts();
//		printStrings();
//		printAnimals();
		
		Random r = new Random();
		int p1 = r.nextInt(9);
		int p2 = r.nextInt(9);
		while (p2 == p1)
		{
			p2 = r.nextInt(9);
		}
		System.out.println("P1: " + p1);
		System.out.println("P2: " + p2);
		
		System.out.println("**************** NON-GENERIC SWAPS ***************");
		/* HERE we see the non-generic methods */
		swapInts(p1, p2, myInts);
		printInts();
		
		swapStrings(p1, p2, myStrings);
		printStrings();
		
		swapObjects(p1, p2, myAnimals);
		printAnimals();
		
		
		System.out.println("\n\n\n**************** GENERIC SWAPS ***************");
//		we CAN'T use primitive types in Generics!
//		bu yüzden helper class kullanýlýr
		resetInts();
//		resetInts denmeden swap edilseydi myInts en ilk haline dönecekti
		
//		int kullanýlamayacaðý için hata verir: 
//		swapItems(p1, p2, myInts);
		
//		helper class yaratýlýr ve casting yapýlýr
		Integer[] myIntegers = new Integer[SIZE]; // declaration
		for (int i = 0; i < SIZE; i++)
		{
			myIntegers[i] = (Integer)myInts[i]; // assignment and casting
//			"(Integer)" denmese de olurdu upcasting olduðu için 
		}
		
		swapItems(p1, p2, myIntegers);
		
//		printInts metodu primitive içerdiðinden kullanýlamadý
		for (Integer i : myIntegers)
		{
			System.out.println("Next Integer: " + i); // printing
		}
		
		resetStrings();
//		resetStrings denmeden swap edilseydi myStrings en ilk haline dönecekti
		swapItems(p1, p2, myStrings); 
		// calls the generic method
		printStrings();
		
		resetAnimals();
		swapItems(p1, p2, myAnimals);
		printAnimals();
		
		System.out.println("\n\n\n\n *********GENERIC PRINT METHOD*********");
		//can you define a generic print method and use that instead?
		//of course -- but you would need to use getClass() to tell what type!
		printItems(myIntegers);
		printItems(myStrings);
		printItems(myAnimals);
	}
	
//	*** RESET-PRINT DUOS ***
	private static void resetInts()
	{
		myInts = new int[SIZE];
		for (int i = 0; i < SIZE; i++) // assigns value in for loop
		{
			myInts[i] = i+1;
		}
	}
	private static void printInts()
	{
		for (int i : myInts) // prints
		{
			System.out.println("Next int: " + i);
		}
	}
	private static void resetStrings()
	{
//		array initializer
		myStrings = new String[]{
				"The"
				, "Quick"
				, "Brown"
				, "Fox"
				, "Jumps"
				, "Over"
				, "The"
				, "Lazy"
				, "Dog"
				, "."
			};
	}
	private static void printStrings()
	{
		for (String s : myStrings)
		{
			System.out.println("Next String: " + s);
		}
	}
	private static void resetAnimals()
	{
		myAnimals = new Animal[SIZE];
		myAnimals[0] = new Animal("Aardvark"); 
		myAnimals[1] = new Animal("Bear");
		myAnimals[2] = new Animal("Chipmunk");
		myAnimals[3] = new Animal("Dog");
		myAnimals[4] = new Animal("Eagle");
		myAnimals[5] = new Animal("Frog");
		myAnimals[6] = new Animal("Giraffe");
		myAnimals[7] = new Animal("Hedgehog");
		myAnimals[8] = new Animal("Ibex");
		myAnimals[9] = new Animal("Jaguar");
//		assigns value one by one
		
	}
	private static void printAnimals()
	{
		for (Animal a : myAnimals)
		{
			System.out.println("Next Animal: " + a); 
			// toString method called
		}
	}
	
	// *** NON-GENERIC SWAP METHODS ***
	public static void swapStrings(int p1, int p2, String[] strings)
	{
		String temp = strings[p1];
		strings[p1] = strings[p2];
		strings[p2] = temp;
	}
	
	public static void swapInts(int p1, int p2, int[] ints)
	{
		int temp = ints[p1];
		ints[p1] = ints[p2];
		ints[p2] = temp;
	}
	
	public static void swapObjects(int p1, int p2, Animal[] objs)
	{
		Animal temp = objs[p1];
		objs[p1] = objs[p2];
		objs[p2] = temp;
	}
	
//	SWAP methods of ints, strings and objects are similar to each other
//	so we make them generic
//	be careful that primitive int has been converted into Int helper class
	
	// *** GENERIC SWAP and PRINT METHODS ***
	public static <T> void swapItems(int p1, int p2, T[] items)
//	we pass in generic typed (interchangeable) array of items
//	we declare the generic type in our method declaration as well 
//	generic metod olduðu için <T> dendi
	{
		T temp = items[p1];
		items[p1] = items[p2];
		items[p2] = temp;
	}
	
	//a generic item printer
//	we shouldn't make generic prints item specific
	public static <T> void printItems(T[] items)
	{
		for (T item : items)
		{
			System.out.println("Next " + item.getClass().getName() 
								+ ": " + item); // toString method called
		}
	}
}
/*
 P1: 1
P2: 0
**************** NON-GENERIC SWAPS ***************
Next int: 2
Next int: 1
Next int: 3
Next int: 4
Next int: 5
Next int: 6
Next int: 7
Next int: 8
Next int: 9
Next int: 10
Next String: Quick
Next String: The
Next String: Brown
Next String: Fox
Next String: Jumps
Next String: Over
Next String: The
Next String: Lazy
Next String: Dog
Next String: .
Next Animal: Animal] Name: Bear

Next Animal: Animal] Name: Aardvark

Next Animal: Animal] Name: Chipmunk

Next Animal: Animal] Name: Dog

Next Animal: Animal] Name: Eagle

Next Animal: Animal] Name: Frog

Next Animal: Animal] Name: Giraffe

Next Animal: Animal] Name: Hedgehog

Next Animal: Animal] Name: Ibex

Next Animal: Animal] Name: Jaguar




**************** GENERIC SWAPS ***************
Next Integer: 2
Next Integer: 1
Next Integer: 3
Next Integer: 4
Next Integer: 5
Next Integer: 6
Next Integer: 7
Next Integer: 8
Next Integer: 9
Next Integer: 10
Next String: Quick
Next String: The
Next String: Brown
Next String: Fox
Next String: Jumps
Next String: Over
Next String: The
Next String: Lazy
Next String: Dog
Next String: .
Next Animal: Animal] Name: Bear

Next Animal: Animal] Name: Aardvark

Next Animal: Animal] Name: Chipmunk

Next Animal: Animal] Name: Dog

Next Animal: Animal] Name: Eagle

Next Animal: Animal] Name: Frog

Next Animal: Animal] Name: Giraffe

Next Animal: Animal] Name: Hedgehog

Next Animal: Animal] Name: Ibex

Next Animal: Animal] Name: Jaguar





 *****GENERIC PRINT METHOD*****
Next java.lang.Integer: 2
Next java.lang.Integer: 1
Next java.lang.Integer: 3
Next java.lang.Integer: 4
Next java.lang.Integer: 5
Next java.lang.Integer: 6
Next java.lang.Integer: 7
Next java.lang.Integer: 8
Next java.lang.Integer: 9
Next java.lang.Integer: 10
Next java.lang.String: Quick
Next java.lang.String: The
Next java.lang.String: Brown
Next java.lang.String: Fox
Next java.lang.String: Jumps
Next java.lang.String: Over
Next java.lang.String: The
Next java.lang.String: Lazy
Next java.lang.String: Dog
Next java.lang.String: .
Next Animal: Animal] Name: Bear

Next Animal: Animal] Name: Aardvark

Next Animal: Animal] Name: Chipmunk

Next Animal: Animal] Name: Dog

Next Animal: Animal] Name: Eagle

Next Animal: Animal] Name: Frog

Next Animal: Animal] Name: Giraffe

Next Animal: Animal] Name: Hedgehog

Next Animal: Animal] Name: Ibex

Next Animal: Animal] Name: Jaguar 
 */
