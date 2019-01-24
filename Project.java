import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 
 * @author akshyta, anushika
 * 
 * The following class is used as a comparator for sorting Items by name
 *
 */
class SortByName implements Comparator<Item>
{

	public int compare(Item o1, Item o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
/**
 * 
 * @author akshyta, anushika
 * 
 * The following class is used as a comparator for sorting Items by category
 *
 */
class SortByCategory implements Comparator<Item>
{
	public int compare(Item o1, Item o2) {
		
		return o1.getCategory().getName().compareTo(o2.getCategory().getName());
	}

}
/**
 * 
 * @author akshyta, anushika
 * 
 * The following class is used as a comparator for sorting Items by cost
 *
 */
class SortByCost implements Comparator<Item>
{
	public int compare(Item o1, Item o2) {
		
		return o1.get_cost().get_D()-o2.get_cost().get_D();
	}

}

/**
 * Main class having instance of Superstore and Superuser.
 * @author akshyta, anushika
 *
 */
public class Project {
	
	
	static Superstore s=new Superstore();
	static superUser Supuser;
	
	/**
	 * function to serialize a Superstore passed as parameter.
	 * @param s
	 */
	public static void Serialize(Superstore s)
	{
		try
		{
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("superstore.txt"));
			oos.writeObject(s);
			oos.flush();
			oos.close();
			System.out.println("print");
		}
		catch(Exception e)
		{
			return;
		}
	}
	/**
	 * function to deserialize a Superstore.
	 * @return
	 */
	public static Superstore deSerialize()
	{
		Superstore s=null;
		try
		{
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("superstore.txt"));
		
		s=(Superstore)ois.readObject();
		
		ois.close();
		}
		catch(Exception e)
		{
			
		}
		return s;
	}
	/**
	 * Main function which obtains the deserialized Superstore.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		s=(Superstore)deSerialize();
		System.out.println(s);
		if(s==null)
		{
			s=new Superstore();
		}
		Supuser=new superUser("SUser","S@USER","PASS",s);
	}

}