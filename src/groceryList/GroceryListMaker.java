package groceryList;

public class GroceryListMaker {

    private static GroceryListItem[] groceryItems = new GroceryListItem[1];

    public static void main(String[] args) {

        Input userInput = new Input();

        System.out.println("What's the name of the product you would like to add?");

        String itemName = userInput.getString();

        System.out.println("How many are there?");

        int itemQuantity = userInput.getInt();

        System.out.println("What kind of item is it?");

        String itemCategory = userInput.getString();

        GroceryListItem groceryItem = new GroceryListItem(itemName, itemQuantity, itemCategory);

        groceryItems = groceryItem.addGroceryListItem(groceryItems, groceryItem);

        for(GroceryListItem item : groceryItems) {
            System.out.println(item);
        }



    }



}
