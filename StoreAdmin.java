import java.io.Serializable;

/**
 * 
 * Class representing the administrator of a store.
 * @author akshyta, anushika
 *
 */
public class StoreAdmin extends Admin implements Serializable
{
	private Store s;

	/**
	 * Getter function
	 * @return the store of which the particular instance is an administrator.
	 */
	
	public Store getStore() {
		return s;
	}

	/**
	 * Setter function 
	 * To set the store for which the particular instance is an administrator.
	 * @param s
	 */
	public void setStore(Store s) {
		this.s = s;
	}
	/**
	 * Constructor.
	 * @param a
	 * @param b
	 * @param st
	 */
	StoreAdmin(String a,String b,Store st)
	{
		login_id=a;
		password=b;
		s=st;
	}
	
}

