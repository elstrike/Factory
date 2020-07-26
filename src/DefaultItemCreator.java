import fw.Creator;
import fw.Item;

public class DefaultItemCreator extends Creator {
    @Override
    protected String end(String itemName) {
        System.out.println("Default 마무리 작업");
        return itemName;
    }

    @Override
    protected String init(String itemName) {
        System.out.println("Default 초기 작업");
        return itemName;
    }

    @Override
    protected Item createItem(String itemName) {
        System.out.println("createItem");
        return new DefaultItem(itemName);
    }
}
