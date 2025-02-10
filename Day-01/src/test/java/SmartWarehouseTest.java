import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.generics.warehouse_management_system.*;

public class SmartWarehouseTest {
    Storage<Electronics> storage = new Storage<>();

    @BeforeEach
    public void setUp() {
        storage = new Storage<>();
    }

    @Test
    public void testAddItem() {
        Electronics electronics = new Electronics("Smartphone");
        storage.addItem(electronics);

        assertEquals(1, storage.getItems().size());
        assertTrue(storage.getItems().get(0) instanceof Electronics);
    }

    @Test
    public void testDisplayItems() {
        Electronics electronics = new Electronics("Laptop");

        storage.addItem(electronics);

        WarehouseUtility.displayAllItems(storage.getItems());
    }
}
