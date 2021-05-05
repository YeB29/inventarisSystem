import static org.junit.Assert.*;

public class InventoryTest {

    Inventory item = new Inventory();
    @org.junit.Test
    public void staringTest(){

        assertEquals(0, item.totalItem(),0.001);
        assertEquals (0, item.getCount());
    }
    @org.junit.Test
    public void firstItemAdd() {
        item.addItem(10);

        assertEquals (10, item.getCount());
        item.addItem(10);

        assertEquals (20, item.getCount());
    }

    @org.junit.Test
    public void resetTest() {
        item.addItem(10);
        assertEquals (10, item.getCount());
        item.addItem(10);
        assertEquals (20, item.getCount());
        item.reset();
        assertEquals (0, item.getCount());
    }


}