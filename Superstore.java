import java.io.Serializable;
import java.util.ArrayList;

/**
 * 
 * @author akshyta, anushika
 * Class representing Superstore containing the list of all warehouses, stores, store admins and warehouse admins.
 */
public class Superstore implements Serializable
{
	ArrayList<Warehouse> AllWarehouses=new ArrayList<Warehouse>();
	ArrayList<Store> AllStores=new ArrayList<Store>();
	ArrayList<StoreAdmin> AllStoreAdmins=new ArrayList<StoreAdmin>();
	ArrayList<WarehouseAdmin> AllWarehouseAdmins=new ArrayList<WarehouseAdmin>();
	ArrayList<EndUser> AllCustomers=new ArrayList<EndUser>();
	public String toString()
	{
		return "s";
	}
}