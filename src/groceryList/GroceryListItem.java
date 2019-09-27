package groceryList;

import java.util.Arrays;

public class GroceryListItem {
    private String name;
    private int quantity;
    private String category;

    public GroceryListItem(String name, int quantity, String category) {
        setName(name);
        setQuantity(quantity);
        setCategory(category);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static GroceryListItem[] addGroceryListItem(GroceryListItem[] array, GroceryListItem newItem) {
        GroceryListItem[] copyOfGroceryListItemArray = Arrays.copyOf(array, array.length);

        copyOfGroceryListItemArray[copyOfGroceryListItemArray.length - 1] = newItem;

        return copyOfGroceryListItemArray;
    }

}
