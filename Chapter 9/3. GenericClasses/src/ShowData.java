
public class ShowData 
// this class allows us to work with 3 objects (classes) that we are gonna create
{
	public static void main(String[] args)
	{
		System.out.println("***data container***");		
		DataContainer<String> sData = new DataContainer<String>("Something");
		DataContainer<Integer> iData = new DataContainer<Integer>(0);
		
		System.out.println(sData);
		System.out.println(iData);
//		toString methods called through reference variables
		
		System.out.println("***better data container***");		
		BetterDataContainer<Integer, String> bdc1 = 
				new BetterDataContainer<Integer, String>(0, "Aardvark");
		BetterDataContainer<Integer, String> bdc2 = 
				new BetterDataContainer<Integer, String>(1, "Dog");
		
		BetterDataContainer<Integer, Animal> bdc3 = 
				new BetterDataContainer<Integer, Animal>(2, new Animal("Zebra"));
		
		BetterDataContainer<String, Animal> bdc4 = 
				new BetterDataContainer<String, Animal>("3", new Animal("Koala"));
		
		System.out.println(bdc1);
		System.out.println(bdc2);
		System.out.println(bdc3);
//		önce BetterDataContainer class'daki ardýndan Animal class'daki toString 
//		metodu çaðýrýlýr (Animal class argument olarak pass edilince)
		System.out.println(bdc4);
		
		System.out.println("***best data container***");		
//		class is initialized (arraylist'te list classý otomatik tanýmlý iken, 
//		biz BestDataContainer'ý ve ona baðlý metodlarý vs tanýmladýk)
		BestDataContainer<Animal> bdc0 = new BestDataContainer<Animal>();
		bdc0.add(new Animal("Aardvark"));
		bdc0.add(new Animal("Bear"));
		bdc0.add(new Animal("Chipmunk"));
		bdc0.add(new Animal("Dog"));
		bdc0.add(new Animal("Eagle"));
		bdc0.add(new Animal("Frog"));
		bdc0.add(new Animal("Giraffe"));
		bdc0.add(new Animal("Hedgehog"));
		bdc0.add(new Animal("Ibex"));
		bdc0.add(new Animal("Jaguar")); 
		// add: explicit method (remove ve get gibi)
		System.out.println(bdc0);
//		toString method called
		
		bdc0.remove(3); // remove on index
		bdc0.remove(new Animal("Frog")); // remove on instance
		System.out.println(bdc0);
		
		System.out.println(bdc0.get(5));
	}
}
/*
 ***data container***
Something
0
***better data container***
T:S] 0 : Aardvark
T:S] 1 : Dog
T:S] 2 : Animal] Name: Zebra

T:S] 3 : Animal] Name: Koala

***best data container***
Next Item: Animal] Name: Aardvark

Next Item: Animal] Name: Bear

Next Item: Animal] Name: Chipmunk

Next Item: Animal] Name: Dog

Next Item: Animal] Name: Eagle

Next Item: Animal] Name: Frog

Next Item: Animal] Name: Giraffe

Next Item: Animal] Name: Hedgehog

Next Item: Animal] Name: Ibex

Next Item: Animal] Name: Jaguar


Next Item: Animal] Name: Aardvark

Next Item: Animal] Name: Bear

Next Item: Animal] Name: Chipmunk

Next Item: Animal] Name: Eagle

Next Item: Animal] Name: Giraffe

Next Item: Animal] Name: Hedgehog

Next Item: Animal] Name: Ibex

Next Item: Animal] Name: Jaguar


Animal] Name: Hedgehog 
 */
