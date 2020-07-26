package fw;

public abstract class Creator {
    public Item create(String itemName) { // Item은 리턴할 방식
        System.out.println("call init");
        init(itemName);
        System.out.println("call createItem");
        Item item = createItem(itemName);
        System.out.println("call end");
        end(itemName);

        System.out.println("return Item create");
        return item;
    }

    abstract protected String end(String itemName);
    abstract protected String init(String itemName);
    abstract protected Item createItem(String itemName);
}
