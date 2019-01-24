import java.io.Serializable;

/**
 * Class representing stores in the Superstore.
 * @author akshyta, anushika
 *
 */
public class Store implements Serializable
{
	private String name;
	private int id;
	private StoreAdmin admin=null;
	private Inventory i;
	private Warehouse w=null;
	public Superstore s;
	/**
	 * Constructor
	 * @param a
	 * @param b
	 * @param i
	 * @param sp
	 */
	Store(String a,int b,Inventory i,Superstore sp)
	{
		name=a;
		id=b;
		this.i=i;
		
		s=sp;
	}
	/** 
	 * Getter function for the name of the Store.
	 * @return name of the store.
	 */
	public String getName()
	{
		return name;
	}
	
	public void setName(String s)
	{
		name=s;
	}
	/** 
	 * Getter function for the id of the Store.
	 * @return unique id of the store.
	 */
	public int getId() 
	{
		return id;
	}
	/**
	 * Setter function for the id of the store.
	 * @param a
	 */
	public void setId(int a)
	{
		id=a;
	}
	
	public Inventory getInventory()
	{
		return i;
	}
	/** 
	 * Getter function for the admin of the Store.
	 * @return  store administrator.
	 */

	public StoreAdmin getAdmin() {
		return admin;
	}

	/** 
	 * Setter function for the admin of the Store.
	 * 
	 */
	public void setAdmin(StoreAdmin admin) {
		this.admin = admin;
	}

	public Warehouse getWarehouse() {
		return w;
	}

	public void setWarehouse(Warehouse w) {
		this.w = w;
	}
	/**
	 * Function to order items from a warehouse 
	 * @param it
	 * @param quantity
	 */
	public void order(Item it,int quantity)
	{
		if(w.getInventory().AllItems.containsKey(it))
		{
			System.out.println("warehouse contains item");
			if(w.getInventory().AllItems.get(it)>quantity)
			{
				System.out.println("Item comes from connected warehouse");
				w.getInventory().AllItems.put(it,w.getInventory().AllItems.get(it)-quantity);
		
			}
			else
			{
				w.OrderFromOthers(s.AllWarehouses,it,quantity-w.getInventory().AllItems.get(it));
				w.getInventory().AllItems.put(it,0);
				System.out.println("Item ordered from other warehouse");
			}
			if(i.AllItems.containsKey(it))
			{
				i.AllItems.put(it, i.AllItems.get(it)+quantity);
			}
			else
			{
				i.AllItems.put(it, quantity);
			}
			
		}
		else
		{
			w.OrderFromOthers(s.AllWarehouses,it,quantity);
			i.AllItems.put(it, quantity);
			
		}
		int flag=0;
		for(int j=0;j<i.AllCategories.size();j++)
		{
			if(i.AllCategories.get(j).equals(it.getCategory()))
			{
				flag=1;
				break;
			}
			
		}
		if(flag==0)
		{
			i.AllCategories.add(it.getCategory());
		}
	}
}
