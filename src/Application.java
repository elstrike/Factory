import fw.Creator;
import fw.Item;

public class Application {
    public static void main(String[] args) {
        Creator creator = new DefaultItemCreator();

        Item item1 = creator.create("나무 칼");
        Item item2 = creator.create("나무 방패");
        Item item3 = creator.create("나무 갑주");

        item1.use();
        item2.use();
        item3.use();
    }
}
