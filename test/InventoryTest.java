import static org.junit.Assert.*;

public class InventoryTest {

    Inventory item = new Inventory();
    @org.junit.Test
    public void staringTest(){
        assertEquals (0, item.getCount());
    }
    @org.junit.Test
    public void firstItemAdd() {
        item.addItem(1);

        assertEquals (1, item.getCount());
        item.addItem(1);

        assertEquals (2, item.getCount());
    }

    @org.junit.Test
    public void resetTest() {
        item.addItem(1);
        assertEquals (1, item.getCount());
        item.addItem(1);
        assertEquals (2, item.getCount());
        item.reset();
        assertEquals (0, item.getCount());
    }
    @org.junit.Test
    public void weightTest() {
        item.addItem(1);
        item.addWeight(0.500);
        assertEquals(1, item.getCount());
        assertEquals(0.500, item.getWeight(),0.001);
    }
    @org.junit.Test
    public void weightinTest() {
                                                                                                                                                                                                                                item.addItem(2);
        item.addWeight(4);
        assertEquals(2, item.getCount());
        assertEquals(4, item.getWeight(),0.001);

        item.addWeight(8);
        assertEquals(5, item.getCount());
        assertEquals(12, item.getWeight(),0.001);

    }
}