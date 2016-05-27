
public class Animal 
{
	private String _name;
	
	public Animal()
	{
		//do nothing
	}
	
	public Animal(String name)
	{
		_name = name;
	}
	
	public String getName()
	{
		return _name;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s] Name: %s\n"
								, getClass().getName()
								, _name);
	}
	
	@Override
	public boolean equals(Object o1)
	{
//		we compare 2 animals to see if they're equal
		if (o1 == null) return false;
		if (!(o1 instanceof Animal)) return false;
		return (this.getName().equals(((Animal)o1).getName()));
//		returns true or false
		// alt:
		// Object o1 = new Animal(); -> argument pass edilince
//		Animal o2 = (Animal)o1;
//		return (this.getName().equals(o2.getName()));
	}
}
