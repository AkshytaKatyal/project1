import java.io.Serializable;

/**
 * 
 * @author akshyta, anushika
 * This class represents the items stored in the warehouses and stores
 *
 */
public class Item implements Serializable
{
	private String name;
	private Category ParentCategory;
	private Subcategory ParentSubcategory;
	private Cost cost=new Cost();
	
	/**
	 * 
	 * @param n
	 * @param pc
	 * @param ps
	 * @param D
	 * @param H
	 * @param K
	 * 
	 * The following is a contructor for Item class
	 */
	public Item(String n, Category pc, Subcategory ps,int D,int H,int K)
	{
		name = n;
		ParentCategory=pc;
		ParentSubcategory=ps;
		cost.update_D(D);
		cost.update_H(H);
		cost.update_K(K);
	}
	/**
	 * 
	 * Getter function 
	 * @return name of the item
	 */
	public String getName()
	{
		return this.name;
	}
	/**
	 * 
	 * Setter function 
	 * sets the name of the item
	 */
	public void setName(String n)
	{
		name=n;
	}
	
	public Category getCategory()
	{
		return ParentCategory;
	}
	/**
	 * 
	 * Getter function 
	 * @return subcategory of the item
	 */
	public Subcategory getSubcategory()
	{
		return ParentSubcategory;
	}
	public Cost get_cost()
	{
		return this.cost;
	}
	/**
	 * 
	 * Getter function 
	 * @return EOQ of the item
	 */
	public int get_EOQ()
	{
		return this.cost.get_EOQ();
	}
	
	
}


