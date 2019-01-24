import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;


/**
 * 
 * @author akshyta, anushika
 *
 *class representing a warehouse containing a list of stores linked to it and its administrator as attributes.
 */
public class Warehouse implements Serializable
{
	private String name;
	private int id;
	private WarehouseAdmin admin=null;
	private Inventory i;
	public ArrayList<Store> ListOfStores=new ArrayList<Store>();
	public int city;
	/**
	 * constructor.
	 */
	public Warehouse(String a,int b,Inventory d)
	{
		name=a;
		id=b;
		i=d;
	}
	/** 
	 * getter function
	 * @return name of the warehouse
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * sets the name of the warehouse
	 * @param s
	 */
	public void setName(String s)
	{
		name=s;
	}
	/** 
	 * getter function
	 * @return id of the warehouse
	 */
	public int getId() 
	{
		return id;
	}
	/**
	 * sets the id of the warehouse
	 * @param a
	 */
	public void setId(int a)
	{
		id=a;
	}
	/**
	 * getter function 
	 * @return inventory
	 */
	public Inventory getInventory()
	{
		return i;
	}

	public WarehouseAdmin getAdmin() {
		return admin;
	}

	/**
	 * setter function 
	 * sets the administrator for the warehouse.
	 */
	public void setAdmin(WarehouseAdmin admin) {
		this.admin = admin;
	}
	/**
	 * function to order an item from other warehouses when the current warehouse doesn't contain the item in its inventory.
	 * @param warray
	 * @param item
	 * @param quantity
	 */
	public void OrderFromOthers(ArrayList<Warehouse> warray,Item item,int quantity)
	{
		int min=Integer.MAX_VALUE;
		Warehouse desired=null;
		Item req=null;
		for(int i=0;i<warray.size();i++)
		{
			if(Math.abs(this.city-warray.get(i).city)<min)
			{
				for (Map.Entry<Item,Integer> entry : warray.get(i).getInventory().AllItems.entrySet())
				{
					if(entry.getKey().getName().equals(item.getName()) && entry.getValue()>=quantity)
					{
						min=Math.abs(this.city-warray.get(i).city);
						desired=warray.get(i);
						req=entry.getKey();
					}
				}
				
			}
		}
		if(desired!=null)
		{
			desired.i.AllItems.put(req, desired.i.AllItems.get(req)-quantity);
		}
		else
		{
			System.out.println("no warehouses have item ");
		}
		
	}
}

