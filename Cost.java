import java.io.Serializable;


/**
 * 
 * @author akshyta, anushika
 *
 *This class represents the cost associated with the inventory of items.
 */
public class Cost implements Serializable
{
	private int D;
	private int H;
	private int K;
	private int EOQ;
	
	public int get_EOQ()
	{
		EOQ=(int)Math.sqrt((2*D*K)/H);
		return this.EOQ;
	}
	public int get_D()
	{
		return this.D;
	}
	/**
	 * 
	 * Getter function 
	 * @return the demand of items in units per quarter K  of the item
	 */
	public int get_K()
	{
		return this.K;
	}
	public int get_H()
	{
		return this.H;
	}
	/**
	 * Setter function 
	 * sets the value of fixed cost per quarter D of the item.
	 * @param d
	 */
	public void update_D(int d)
	{
		this.D=d;
	}
	/**
	 * Setter function 
	 * sets the value of carrying cost per unit per quarter H of the item.
	 * @param h
	 */

	public void update_H(int h)
	{
		this.H=h;
	}
	/**
	 * Setter function 
	 * sets the value of demand of items in units per quarter K of the item.
	 * @param k
	 */

	public void update_K(int k)
	{
		this.K=k;
	}
}

