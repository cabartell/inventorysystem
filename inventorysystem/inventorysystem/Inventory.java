package inventorysystem;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<>();

    public void additem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
    }

    public double getInventoryValue(){
        double inventoryValue = 0;
        for (int i = 0 ; i < items.size() ; i++){
            double x = items.get(i).getPrice();
            inventoryValue = inventoryValue + x;
        }
        return inventoryValue;
    }

    public void printInventory(){
        for(Item i : items)
        {
            System.out.println(i);
        }
    }

}
