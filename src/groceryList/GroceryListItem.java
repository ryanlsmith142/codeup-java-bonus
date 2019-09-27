package groceryList;

public class GroceryListItem {
    private String name;
    private int quantity;
    private String category;

    public void GrocerListItem(String name, int quantity, String category) {
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
}
