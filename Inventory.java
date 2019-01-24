
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 
 * @author akshyta, anushika
 *
 *Class representing the inventory of store/warehouse.
 */
public class Inventory implements Serializable
{
	HashMap<Item,Integer> AllItems=new HashMap<Item,Integer>();
	ArrayList<Category> AllCategories=new ArrayList<Category>();
	
	void UpdateQuantity(Item i,int a)
	{
		AllItems.replace(i,a);
	}
	/**
	 * Function to figure out the items whose quantity is reducing to 0 in the store and hence EOQ no. of such items are ordered.  
	 * @param s
	 */
	void EmptyItems(Store s)
	{
		//ArrayList<Item> empty=new ArrayList<Item>();
		for (Map.Entry<Item,Integer> entry : AllItems.entrySet())
		{
			if(AllItems.get(entry.getKey())==0)
			{
				//empty.add(entry.getKey());
				s.order(entry.getKey(),entry.getKey().get_EOQ());
			
			}
		}
	}
	/**
	 * Function to sort items by name.
	 * @return arraylist of sorted items.
	 */
	ArrayList<String> sortItemByName()
	{
		ArrayList<Item> ia=new ArrayList<Item>(AllItems.keySet());
		Collections.sort(ia, new SortByName());
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<ia.size();i++)
		{
			System.out.println(ia.get(i).getName());
			String s=ia.get(i).getName()+"	"+AllItems.get(ia.get(i));
			al.add(s);
		}
		return al;
	}
	/**
	 * Function to sort items by category.
	 * @return arraylist of sorted items.
	 */
	ArrayList<String> sortItemByCategory()
	{
		ArrayList<Item> ia=new ArrayList<Item>(AllItems.keySet());
		Collections.sort(ia, new SortByCategory());
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<ia.size();i++)
		{
			System.out.println("Item: "+ ia.get(i).getName()+" Category: "+ia.get(i).getCategory());
			al.add(ia.get(i).getName()+"	"+AllItems.get(ia.get(i)));
		}
		
		return al;
	}
	/**
	 * Function to sort items by cost.
	 * @return arraylist of sorted items.
	 */
	ArrayList<String> sortItemByCost()
	{
		ArrayList<Item> ia=new ArrayList<Item>(AllItems.keySet());
		Collections.sort(ia, new SortByCost());
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<ia.size();i++)
		{
			System.out.println("Item: "+ia.get(i).getName()+" has fixed cost of: Rs"+ia.get(i).get_cost().get_D() );
			al.add(ia.get(i).getName()+"	"+AllItems.get(ia.get(i)));
		}
		
		return al;
	}
	/**
	 * Function to delete item.
	 * @param i
	 */
	void deleteItem(Item i)
	{
		i.getSubcategory().deleteitem(i);
		int x=AllItems.remove(i);
		
	}

	/**
	 * function to delete category 
	 * @param c
	 */
	void deleteCategory(Category c)
	{
		ArrayList<Item> a=new ArrayList<Item>();
		for (Map.Entry<Item,Integer> entry : AllItems.entrySet())
			{
				if(entry.getKey().getCategory().getName().equals(c.getName()))
				{
					a.add(entry.getKey());
					
				}
			}
		
		for(int i=0;i<a.size();i++)
		{
			AllItems.remove(a.get(i));
		}
		for(int i=0;i<AllCategories.size();i++)
		{
			if(AllCategories.get(i).getName().equals(c.getName()))
			{
				AllCategories.remove(i);
				break;
			}
		}
	}
	/**
	 * Function to search for a matching category.
	 * @return arraylist of categories that match.
	 */
	
	ArrayList<Item> SearchCategory(Category c)
	{
		ArrayList<Item> temp=new ArrayList<Item>();
		for (Map.Entry<Item,Integer> entry : AllItems.entrySet())
		{
			if(entry.getKey().getCategory().getName().substring(0,c.getName().length()).equals(c.getName()))
			{
				temp.add(entry.getKey());
			}
		}
		return temp;
	}
	/**
	 * Function to search for a matching sub-category.
	 * @return arraylist of sub-categories that match.
	 */
	ArrayList<Item> SearchSubcategory(Subcategory s,Category c)
	{
		ArrayList<Item> temp=new ArrayList<Item>();
		for (Map.Entry<Item,Integer> entry : AllItems.entrySet())
		{
			if(entry.getKey().getSubcategory().getName().substring(0,s.getName().length()).equals(s.getName()))
			{
				temp.add(entry.getKey());
			}
		}
		return temp;
	}
	
	
	/**
	 * 
	 * @param name
	 * @return item matching the search criteria.
	 */

	public Item Search_item(String name) {
		
		for (Map.Entry<Item,Integer> entry : AllItems.entrySet())
		{
			if(entry.getKey().getName().substring(0,name.length()).equals(name))
			{
				return entry.getKey();
			}
		}
		return null;
		
	}


	/**
	 * Function to add a category in the inventory.
	 * @param c
	 */
	public void add_category(Category c) {
		
		AllCategories.add(c);
		
	}
	/**
	 * Function to add a sub category in the inventory.
	 * @param s
	 * @param c
	 */
	public void add_subcategory(Subcategory s, Category c) {
		
		c.addsubcategory(s);
	}

	/**
	 * function to delete a sub-category in the inventory.
	 * @param c
	 * @param s
	 */
	
	public void delete_subcategory(Category c,Subcategory s) {
		
		ArrayList<Item> a=new ArrayList<Item>();
		for (Map.Entry<Item,Integer> entry : AllItems.entrySet())
		{
			if(entry.getKey().getSubcategory().getName().equals(s.getName()))
			{
				a.add(entry.getKey());
			}
		}
		for(int i=0;i<a.size();i++)
		{
			AllItems.remove(a.get(i));
		}
		c.deletesubcategory(s);
	}


/**
 * Function to add an item with the desired quantity in the inventory.
 * @param it
 * @param s
 * @param quantity
 */
	
	public void add_item(Item it, Subcategory s, int quantity) {
		
		s.additem(it);	
		AllItems.put(it, quantity);
		
	}

	
}

