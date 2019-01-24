import java.io.Serializable;

/**
 * 
 * Abstract Class that represents the administrators of the System. 
 * 
 * @author akshyta, anushika
 *
 */
public abstract class Admin implements Serializable
{
	protected String login_id;
	protected String password;
	
	/**
	 * Getter function
	 * @return the id of the administrator.
	 */
	public String getlogin_id()
	{
		return this.login_id;
	}
	/**
	 * Getter function
	 * @return the password of the administrator.
	 */
	public String getpassword()
	{
		return this.password;
	}
	/**
	 * 
	 * @return Inventory 
	 */
	public Inventory see_inventory()
	{
		
		return null;
		
	}
	/**
	 * 
	 * @param Quantity
	 */
	public void update_inventory(int Quantity)
	{
		
	}
	
}

