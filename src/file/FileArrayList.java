package file;
import java.util.*;

public class FileArrayList<T> implements File<T> {

	ArrayList<T> file;
	
	public FileArrayList() 
	{
		 file = new ArrayList<T>();
	}
	
	public void enfiler(T o)
	{
		file.add(o);
	}
	
	public boolean vide()
	{
		return file.isEmpty();
	}
	
	public T defiler()
	{
		return (!file.isEmpty()) ? file.remove(0) : null;
	}
	
	public T premier()
	{
		return (!file.isEmpty()) ? file.get(0) : null;
	}

}
