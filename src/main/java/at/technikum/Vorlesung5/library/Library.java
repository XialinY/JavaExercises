package at.technikum.Vorlesung5.library;

public class Library {

    private String name;
    private Item[] items;
    private int itemCount = 0;

    public Library(String name) {
        this.name = name;
        this.items = new Item[100];
        this.itemCount = 0;
    }


    public void addItem(Item item) {
        items[itemCount] = item;
        itemCount++;
    }

    public Item findItem(String id) {
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];

            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public boolean rent(Item item, Member member) {
        if (item.getStatus() == Status.FREE) {
            item.setRentedBy(member);
            return true;
        }
        return false;
    }
    public boolean rent(String id, Member member) {
        Item item = findItem(id);
        if (null == item) {
            return false;
        }
        return rent(item, member);
    }
    public void returnItem(Item item) {
        //TODO
        item.setRentedBy(null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
}
