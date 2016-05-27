import java.util.NoSuchElementException;


public class BestDataContainer<T>
// has only 1 type and it is array of objects 
//(ne olduðu þimdiden belli deðil)
{
	Object[] data;	//data structure
//	data is a variable that is containing the objects passed in.
//	since we don't know what type T is 
//	(might be string, animal or integer array), 
//	we created an object array
//	we don't want multiple arrays just to handle whatever type 
//	comes in and use if sta because that would be a giant mess.
//	object is our super type. we first store in object and 
//	then cast them back
	int countItems; //number of valid items
//	countitems manages how many data we got
//	data.length direkt 10 olurken, countItems 1'er 1'er artar
	
	/**
	 * Default Constructor.
	 */
	public BestDataContainer()
	{
		//do nothing
		this(10);
	}
	
	/**
	 * Explicit Constructor.
	 * @param capacity maximum size of data structure
	 */
	public BestDataContainer(int capacity)
	{
		data = new Object[capacity]; 
		// object array created
//		diðer örneklerde T capacity deniyordu
		countItems = 0;
	}
	
	/**
	 * Get the current size (not the length!)
	 * @return count of items in the Container
	 */
//	kullanýlmadý
	public int size()
	{
		return countItems;
	}
	
	/**
	 * Add an item to the container (best data container).
	 * Can't add null, can't add past capacity, can't add duplicates
	 * @param item to add
	 * @return true if added, else false
	 */
	public boolean add(T item) 
// Animal item denebilirdi 
//	(argumenti T olan diðer metodlar da Animal yapýlarak) 
//	ancak o zaman genericliðin anlamý kalmazdý
//	we manage the arrays generically on any type
	{
		//can't add if item is null
		if (item == null)
		{
			return false;
		}
		
		//can't add if at capacity
//		countitems küçük olmalý
		if (countItems == data.length)
		{
			return false;
		}
		
		//don't add duplicate
		int itemIndex = findItem(item);
		if (itemIndex > 0)
		{
			return false;
		}
		
//		add to next item
//		we increment the counter
		data[countItems++] = item;
//		countItems 0'dan itibaren baþlar
		return true;
	}
	
	/**
	 * Remove an item if it exists by index.
	 * @param index the index to remove from the container.
	 * @return true if item is removed, else false.
	 * @throws NoSuchElementException if index is not valid
	 */
	public boolean remove(int index) // remove by index
	{
		validateIndex(index);
		int i = index;
        int j = i + 1;
        //remove it:
//        arraydeki sonraki elemanlar da slide ediliyor
        while (j < countItems)
        {
            data[j-1] = data[j];
            j++;
        }
        countItems--;
        return true;
//     returnün true veya false olmasý semantic olarak önemli   
	}
	
	/**
	 * Remove an item that is equal to the passed in item.
	 * 	can't remove a null item, can't remove an item if it is not in the container.
	 * @param item the item to remove.
	 * @return true if the item is removed, else false. 
	 */
	public boolean remove(T item) // remove by instance
	{
		if (item == null) return false;
		int index = findItem(item); 
//		finding the item in the system
		if (index < 0) return false;
		return remove(index); 
		// calls remove by index method
	}
	
	/**
	 * Find an item by the item itself
	 * 	relies on valid equality being implemented in type T
	 * @param item the item for which to find the index
	 * @return the index of the item if found, -1 if not in the container.
	 */
	public int findItem(T item)
//	item, index cinsinden dengi var mý diye karþýlaþtýrýlýyor
	{
		for (int i = 0; i < countItems; i++)
		{
			if (data[i].equals(item)) return i;
//			Animal class implemeted the equals method
//			we implemented the equals method in a meaningful way
		}
		return -1;
//		findItem metodunu çaðýran metodlar return edilen sayýnýn 
//		pozitif veya negatif olmasýna göre aksiyon gerçekleþtiriyor
	}

	/**
	 * Get an item at an index.
	 * @param index the index to get an item from.
	 * @return the item at the given index.
	 * @throws NoSuchElementException if the index is invalid.
	 */
	public T get(int index)
	{
		validateIndex(index);
		//unsafe cast here...
		return (T)data[index];
//		we cast the int to type T
		// alt: 
//		T t = (T)data[index];
//		return t;
	}
	
	/**
	 * Validate the index.
	 * @param index the index to validate.
	 * @throws NoSuchElementException if the index is invalid.
	 */
	private void validateIndex(int index)
	{
		if (index < 0 || index >= countItems)
		{
			throw new NoSuchElementException("Invalid Index");
		}
	}

	/**
	 * Print out all the items in the container.
	 * 	relies on toString() being implemented in the type T
	 * @return String representing all items in the container.
	 */
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < countItems; i++)
		{
			sb.append("Next Item: " + data[i] + "\n");
		}
		return sb.toString();
	}
}

