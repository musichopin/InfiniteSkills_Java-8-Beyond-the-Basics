// class initialize edileceði için generic olmuþ
// generic class çok sayýda generic metod bulundurur (?)
public class BetterDataContainer<T, S> 
// this class has two types same time
// it can be two strings or whatever
// but by having different types (T and S) we 
// guarantee to pass two different arguments
{
	T obj1;
	S obj2;
	
	public BetterDataContainer(T o1, S o2)
	{
		obj1 = o1;
		obj2 = o2;
	}
	
	public T getT()
	{
		return obj1;
	}
	
	public void setT(T o1)
	{
		obj1 = o1;
	}
	
	public S getS()
	{
		return obj2;
	}
	
	public void setS(S o2)
	{
		obj2 = o2;
	}
	
	public String toString()
	{
		return String.format("T:S] %s : %s"
				, obj1.toString()
				, obj2.toString());
//		obj1 ve obj2 dense de olurdu
	}
}
