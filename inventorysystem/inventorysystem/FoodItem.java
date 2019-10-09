
package inventorysystem;

import java.util.Date;

/**
 * @author camiag
 */
public class FoodItem extends inventorysystem.Item {
    
    private Date expires;
    
    public FoodItem(String name, double price, Date expires)
    {
        super(name,price);
        this.expires = expires;
    }
    
    public Date getExpires()
    {
        return this.expires;
    }
    
    @Override
    public String toString()
    {
        return this.getName() + " " + this.getPrice() + " " + this.expires;
    }
    
}
