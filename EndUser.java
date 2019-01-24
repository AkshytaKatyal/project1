
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * class representing the end user.
 * @author akshyta, anushika
 *
 */
public class EndUser 
{
	static int count=0;
	
	int membership_id=0;
	int bonus_point=0;
	HashMap<Item,Integer> cart=new HashMap<Item,Integer>();
	
	/**
	 * constructor 
	 * @param n 
	 */
	public EndUser()
	{
		
	}
	/**
	 * function to add a desired item to the user's cart. 
	 * @param i
	 * @param quantity
	 */
	public void add_to_cart(Item i, int quantity)
	{
		cart.put(i, quantity);
		if(membership_id!=0)
		{
		bonus_point+=5;
		}
	}
	/**
	 * function to figure out if the customer is eligible for availing discounts.
	 * @return true if customer can avail discount.
	 */
	public int give_id()
	{
		count++;
		return count;
	}
	/**
	 * function to validate the membership id of the customer 
	 * @param id
	 * @return true if the id given by the user matches the his registered membership id.
	 */
	public boolean validate_id(int id)
	{
		if(id==membership_id)
		{
			return true;
		}
		return false;
	}
	/**
	 * function to calculate the final cost of all items purchased by the user.
	 * @return the total cost of all items purchased by user. 
	 */
	public float purchase()
	{
		float cost=0;
		for (Map.Entry<Item,Integer> entry : cart.entrySet())
		{
			cost+=entry.getKey().get_cost().get_D()*cart.get(entry.getKey());
			
		}
		if(bonus_point>1000)
		{
			cost=(float)(0.9*cost);
		}
		return cost;
	}
}


