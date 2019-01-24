import java.io.Serializable;
import java.util.ArrayList;

/**
 * 
 * @author akshyta, anushika
 * This class represents the sub-category available under a particular category in a store/warehouse.
 *
 */
public class Subcategory implements Serializable
{
	private String Name;
	private Category ParentCategory;
	ArrayList<Item> ListOfItems=new ArrayList<Item>();
	
	/**
	 * constructor 
	 * @param n2
	 * @param p
	 */
	public Subcategory(String n2,Category p) 
	{
		
		Name=n2;
		ParentCategory=p;
	}
	/**
	 * getter function 
	 * @return name of the subcategory
	 */
	public String getName()
	{
		return this.Name;
	}
	/**
	 * setter function
	 * sets the name of the subcategory
	 * @param s
	 */
	public void setName(String s)
	{
		Name=s;
	}
	/**
	 * function to add item under a particular subcategory. 
	 * @param i
	 */
	public void additem(Item i)
	{
		
		int flag=0;
		for(int j=0;j<ListOfItems.size();j++)
		{
			if(ListOfItems.get(j).getName().compareTo(i.getName())==0)
			{
				flag=1;
			}
		}
		if(flag==0)
		ListOfItems.add(i);
		else
		{
			System.out.println("Already Exits!");
		}

	}
	/**
	 * function to delete an item under a particular subcategory.
	 * @param i
	 */
	public void deleteitem(Item i)
	{
		
		int flag=0;
		for(int j=0;j<ListOfItems.size();j++)
		{
			if(ListOfItems.get(j).getName().compareTo(i.getName())==0)
			{
				flag=1;
			}
		}
		if(flag==1)
		ListOfItems.remove(i);
		else
		{
			System.out.println("Item does not Exits!");
		}
	}
	/**
	 * getter function 
	 *
	 * @return parent category of the particular subcategory.
	 */
	public Category getPcategory()
	{
		return this.ParentCategory;
	}
	
}

