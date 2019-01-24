import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author akshyta, anushika
 * 
 * class representing warehouse administrator.
 *
 */
public class WarehouseAdmin extends Admin implements Serializable
{
	private Warehouse w;
	/**
	 * getter function 
	 * @return warehouse associated with the administrator.
	 */

	public Warehouse getWarehouse() {
		return w;
	}
	/**
	 * setter function
	 * @param w
	 * function to set the warehouse of which the particular instance is an administrator.
	 */

	public void setWarehouse(Warehouse w) {
		this.w = w;
	}
	/**
	 * Constructor
	 * @param a
	 * @param b
	 * @param w
	 */
	WarehouseAdmin(String a,String b,Warehouse w)
	{
		login_id=a;
		password=b;
		this.w = w;
	}
	/**
	 * function to add category in the inventory of the warehouse.
	 * @param n
	 */
	void addCategory(String n)
	{
		Category c=new Category(n);
		w.getInventory().add_category(c);
	}
	/**
	 * function to return the list of items to be ordered.
	 * @return the list of items to be ordered.
	 */
	ArrayList<Item> ItemsToBeOrdered()
	{
		ArrayList<Item> empty=new ArrayList<Item>();
		HashMap<Item,Integer> AllItems=w.getInventory().AllItems;
		for (Map.Entry<Item,Integer> entry : AllItems.entrySet())
		{
			if(AllItems.get(entry.getKey())==0)
			{
				empty.add(entry.getKey());
								
			}
		}
		return empty;
	}
	/**
	 * function to delete a category in the warehouse inventory.
	 * @param n
	 */
	void deleteCategory(String n)
	{
		for(int i=0;i<w.getInventory().AllCategories.size();i++)
		{
			if(n.equals(w.getInventory().AllCategories.get(i).getName()))
			{
				w.getInventory().deleteCategory(w.getInventory().AllCategories.get(i));
			}
		}
	}
	/**
	 * function to add a sub-category in the inventory of warehouse.
	 * @param n1
	 * @param n2
	 */
	void AddSubcategory(String n1,String n2)
	{
		Subcategory s=null;
		int flag=0;
		Category c=null;
		
		for(int i=0;i<w.getInventory().AllCategories.size();i++)
		{
			if(n1.equals(w.getInventory().AllCategories.get(i).getName()))
			{
				c=w.getInventory().AllCategories.get(i);
				s=new Subcategory(n2,c);
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			w.getInventory().add_subcategory(s, c);
		}
		else
		{
			System.out.println("Category does not exist");
		}
	}
	/**
	 * function to delete a sub-category in the warehouse inventory.
	 * @param n
	 */
	void deleteSubcategory(String n)
	{
		int flag=0;
		Subcategory s=null;
		for(int i=0;i<w.getInventory().AllCategories.size();i++)
		{
			for(int j=0;j<w.getInventory().AllCategories.get(i).ListOfSubcategories.size();j++)
			{
				if(w.getInventory().AllCategories.get(i).ListOfSubcategories.get(j).getName().equals(n))
				{
					s=w.getInventory().AllCategories.get(i).ListOfSubcategories.get(j);
					flag=1;
					break;
				}
			}
			if(flag==1)
			{
				break;
			}
		}
		
		if(flag==1)
		{
			w.getInventory().delete_subcategory(s.getPcategory(), s);
		}
		else
		{
			System.out.println("Subcategor does not exist");
		}
	}
	/**
	 * function to add an item in the warehouse inventory.
	 * @param n1
	 * @param n2
	 * @param n3
	 * @param d
	 * @param h
	 * @param k
	 * @param qty
	 */
	void AddItem(String n1,String n2,String n3,int d,int h,int k,int qty)
	{
		int flag=0;
		Category c=null;
		Subcategory s=null;
		for(int i=0;i<w.getInventory().AllCategories.size();i++)
		{
			if(n1.equals(w.getInventory().AllCategories.get(i).getName()))
			{
				c=w.getInventory().AllCategories.get(i);
				flag=1;
				for(int j=0;j<c.ListOfSubcategories.size();j++)
				{
					if(c.ListOfSubcategories.get(j).getName().equals(n2))
					{
						flag=2;
						s=c.ListOfSubcategories.get(j);
						break;
					}
				}
				break;
			}
		}
		
		if(flag==1)
		{
			s=new Subcategory(n2,c);
			c.ListOfSubcategories.add(s);
			
		}
		else if (flag==0)
		{
			c=new Category(n1);
			w.getInventory().AllCategories.add(c);
			s=new Subcategory(n2,c);
			c.ListOfSubcategories.add(s);
			
			
		}
		
			Item i=new Item(n3,c,s,d,h,k);
			w.getInventory().add_item(i, s, qty);
		
	}
	/**
	 * function to delete an item in the warehouse inventory.
	 * @param n
	 */
	void deleteItem(String n)
	{
		Item i=null;
		int flag=0;
		for (Map.Entry<Item,Integer> entry : w.getInventory().AllItems.entrySet())
		{
			if(entry.getKey().getName().equals(n))
			{
				flag=1;
				i=entry.getKey();
			}
		}
		if(flag==1)
		{
			w.getInventory().deleteItem(i);
		}
		else
		{
			System.out.println("Item does not exist");
		}
	}

	/**
	 * function to update the quantity of an item in the warehouse inventory.
	 * @param n
	 * @param qty
	 */
	void UpdateQuantity(String n,int qty)
	{
		Item i=null;
		int flag=0;
		for (Map.Entry<Item,Integer> entry : w.getInventory().AllItems.entrySet())
		{
			if(entry.getKey().getName().equals(n))
			{
				flag=1;
				i=entry.getKey();
			}
		}
		
		if(flag==1)
		{
			w.getInventory().UpdateQuantity(i, qty);
		}
		else
		{
			System.out.println("Item does not exist");
		}
	}

}

