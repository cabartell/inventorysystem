
package inventorysystem;

/**
 * @author camiag
 */
public class NonFoodItem extends inventorysystem.Item {
    
    private String[] materials;
    
    public NonFoodItem(String name, double price, String[] materials)
    {
        super(name,price);
        this.materials = materials;
    }
    
    public String[] getMaterials()
    {
        //Clone array to avoid external objects to alter materials list
        String[] res = materials.clone();
        return res;
    }
    
    @Override
    public String toString()
    {
        String materialsText = "Materials: ";
        for(String str : materials)
        {
            materialsText += str + " ";
        }
        return this.getName() + " " + this.getPrice() + " " + materialsText;
    }
}
