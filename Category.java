import java.io.Serializable;
import java.util.ArrayList;


/**
 * This class represents the categories available in warehouses and stores.
 * It contains a list of sub categories within a particular category.
 * 
 */
public class Category implements Serializable
{
	private String Name;
	public ArrayList<Subcategory> ListOfSubcategories=new ArrayList<Subcategory>();
	/**
	 * This represents the constructor for the category class.
	 * @param a
	 */
	Category(String a)
	{
		Name=a;
	}
	public String getName()
	{
		return this.Name;
	}
	public void setName(String s)
	{
		Name=s;
	}
	/**
	 * This function is used to add a sub-category under the current category.
	 * @param s
	 */
	public void addsubcategory(Subcategory s)
	{
		
		int flag=0;
		for(int i=0;i<ListOfSubcategories.size();i++)
		{
			if(ListOfSubcategories.get(i).getName().compareTo(s.getName())==0)
			{
				flag=1;
			}
		}
		if(flag==0)
		ListOfSubcategories.add(s);
		else
		{
			System.out.println("Already Exits!");
		}
	}
	/**
	 * This function is used to delete a sub-category under the current category.
	 * @param s
	 */
	public void deletesubcategory(Subcategory s)
	{
	
		int flag=0;
		for(int i=0;i<ListOfSubcategories.size();i++)
		{
			if(ListOfSubcategories.get(i).getName().compareTo(s.getName())==0)
			{
				flag=1;
			}
		}
		if(flag==1)
		ListOfSubcategories.remove(s);
		else
		{
			System.out.println("Sub-category does not Exits!");
		}
	}
	
}
