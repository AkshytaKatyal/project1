import java.io.Serializable;
import java.util.ArrayList;

/**
 * 
 * class representing the super user of the superstore.
 * @author akshyta, anushika
 *
 */

public class superUser implements Serializable{
	
	private String name;
	private Superstore s;
	private String id;
	private String password;
	
	/**
	 * Getter function
	 * 
	 * @return name of the superuser.
	 */
	public String getName() {
		return name;
	}
	/**
	 * Setter function
	 * to set the name for the superuser.
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Getter function 
	 * To get the superstore associated with the given superuser.
	 * @return
	 */
	public Superstore getS() {
		return s;
	}
	/**
	 * Setter function
	 * to set the superstore managed by the particular superuser.
	 * @param s
	 */
	public void setS(Superstore s) {
		this.s = s;
	}
	/**
	 * Getter function
	 * 
	 * @return id of the superuser.
	 */
	public String getId() {
		return id;
	}
	/**
	 * Setter function
	 * to set the id for the superuser.
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * Getter function  
	 * @return password of the superuser.
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * function to set the password for the superuser.
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Constructor 
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 */
	superUser(String a,String b,String c,Superstore d)
	{
		name=a;
		s=d;
		id=b;
		password=c;
	}
	
	/**
	 * function to add a warehouse in the list of registered warehouses of the superstore. 
	 * @param n
	 * @param id
	 * @param au
	 * @param ap
	 * @param num
	 */
	void addWarehouse(String n,int id,String au,String ap,int num) {
		Inventory i=new Inventory();
		Warehouse w=new Warehouse(n,id,i);
		w.city=num;
		WarehouseAdmin a=new WarehouseAdmin(au,ap,w);
		w.setAdmin(a);
		s.AllWarehouses.add(w);
		s.AllWarehouseAdmins.add(a);
		
	}
	/**
	 * function to add a store in the list of registered stores of the superstore.
	 * @param n
	 * @param id
	 * @param w
	 * @param au
	 * @param ap
	 */
	void addStore(String n, int id, Warehouse w, String au,String ap)
	{
		Store ss=new Store(n,id,new Inventory(),s);
		StoreAdmin sa=new StoreAdmin(au,ap,ss);
		ss.setAdmin(sa);
		s.AllStores.add(ss);
		link(w.getId(),id);
		s.AllStoreAdmins.add(sa);
	}
	
	/**
	 * function to link a store to the warehouse with warehouse id and store id as parameters.
	 * @param a
	 * @param b
	 */
	
	void link(int a,int b)
	{
		
		Warehouse w=null;
		for(int i=0;i<s.AllWarehouses.size();i++)
		{
			if(s.AllWarehouses.get(i).getId()==a)
			{
				w=s.AllWarehouses.get(i);
				break;
			}
		}
		
		for(int j=0;j<s.AllStores.size();j++)
		{
			if(s.AllStores.get(j).getId()==b)
			{
				s.AllStores.get(j).setWarehouse(w);
				break;
			}
		}
	}
	/**
	 * function to delete a particular store from the list of registered stores 
	 * @param id
	 */
	void deleteStore(int id)
	{
		int flag=0;
		for(int j=0;j<s.AllStores.size();j++)
		{
			if(s.AllStores.get(j).getId()==id)
			{
				flag=1;
				Warehouse w=s.AllStores.get(j).getWarehouse();
				w.ListOfStores.remove(s.AllStores.get(j));
				s.AllStores.remove(j);
				break;
			}
			
		}
		if(flag==0)
		{
			System.out.println("This store doesnot exist : Invalid ID ");
		}
	}
	/**
	 * function to delete a warehouse from the list of registered warehouses of the superstore.
	 * @param id
	 */
	void deleteWarehouse(int id)
	{
		int prev=-1;
		int val=0;
		for(int j=0;j<s.AllWarehouses.size();j++)
		{
			if(prev==-1)
			{
				prev=s.AllWarehouses.get(j).ListOfStores.size();
			}
			if(s.AllWarehouses.get(j).ListOfStores.size()<prev)
			{
				val=j;
				prev=s.AllWarehouses.get(j).ListOfStores.size();
				
			}
		}
		
		for(int i=0;i<s.AllWarehouses.size();i++)
		{
			if(s.AllWarehouses.get(i).getId()==id)
			{
				for(int k=0;k<s.AllWarehouses.get(i).ListOfStores.size();k++)
				{
					s.AllWarehouses.get(i).ListOfStores.get(k).setWarehouse(s.AllWarehouses.get(val));
					s.AllWarehouses.get(val).ListOfStores.add(s.AllWarehouses.get(i).ListOfStores.get(k));
					
				}

				s.AllWarehouseAdmins.remove(s.AllWarehouses.get(i).getAdmin());
				s.AllWarehouses.remove(i);
				break;
			}
		}
	}
	/**
	 * 
	 * @return list of all warehouses registered with the superstore.
	 */
	ArrayList<String> SeeAllWarehouses()
	{
		ArrayList<String> al=new ArrayList<String>();
		if(s.AllWarehouses.isEmpty())
		{
			System.out.println("No Warehouse registered till now !");
			
		}
		else
		{
			System.out.println("All registered Warehouses are :");
			for(int i=0;i<s.AllWarehouses.size();i++)
			{
				System.out.println(s.AllWarehouses.get(i).getName());
				al.add(s.AllWarehouses.get(i).getName());
			}
		}
		
		
		return al;
	}
	/**
	 * 
	 * @return list of all stores registered with the superstore.
	 */
	ArrayList<String> SeeAllStores()
	{
		ArrayList<String> al=new ArrayList<String>();

		if(s.AllStores.isEmpty())
		{
			System.out.println("No Store registered till now !");
			
		}
		else
		{
			System.out.println("All registered Stores are :");
			for(int i=0;i<s.AllStores.size();i++)
			{
				System.out.println(s.AllStores.get(i).getName());
				al.add(s.AllStores.get(i).getName());
			}
		}
		return al;
	}
	
}
