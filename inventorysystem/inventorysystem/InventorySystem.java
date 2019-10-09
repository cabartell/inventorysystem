
package inventorysystem;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author camiag
 */
public class InventorySystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FoodItem[] foodItems = new FoodItem[10];
        for(int i = 0; i < foodItems.length; i++)
        {
            foodItems[i] = new FoodItem("Food Item " + i, i * 3, new Date());
        }
        
        for(FoodItem fi : foodItems)
        {
            System.out.println(fi);
        }
        
        NonFoodItem[] nonFoodItems = new NonFoodItem[10];
        for(int i = 0; i < nonFoodItems.length; i++)
        {
            nonFoodItems[i] = new NonFoodItem("Non-food Item " + i, 1000 * Math.random(), new String[]{"Material 1", "Material 2"});
        }
        
        for(NonFoodItem nfi : nonFoodItems)
        {
            System.out.println(nfi);
        }

        Inventory inv = new Inventory();
        for (int i = 0; i <= 5; i++){
            inv.additem(new NonFoodItem("Non-food Item " + i, 1000 * Math.random(), new String[]{"Material 1", "Material 2"}));
            inv.additem(new FoodItem("Food Item " + i, i * 3, new Date()));
            inv.printInventory();
            inv.getInventoryValue();
        }
    }
}
