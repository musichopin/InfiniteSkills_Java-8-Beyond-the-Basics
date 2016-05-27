
public class DataContainer<T> 
//<T> in class name means that 
//DataContainer works with multiple types.
// class initialize edileceði için generic olmuþ
{
	T containerData;
	public DataContainer(T data)
	{
		containerData = data;
	}
	
	public T getData()
	{
		return containerData;
	}
	
	public void setData(T value)
	{
		containerData = value;
	}
	
	/**
	 * Get the data printout.
	 * Relies on T having toString() defined.
	 * Returns String representing the state of the container data
	 */
	public String toString()
	{
		return containerData == null 
							? null  
							: String.format("%s"
									, containerData.toString());
//		"containerData" dense de olurdu
	}
}
