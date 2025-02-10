import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.generics.online_marketplace.*;
public class onlineMarketPlaceTest {
    private ProductCatalog<Product> catalog;

@BeforeEach
public void setUp() {
    catalog = new ProductCatalog<>();
}

@Test
public void testAddProduct() {
    ProductCatalog<Book> book = new ProductCatalog<>();
    Book book1 = new Book("Harry Potter", 250, BookCategory.FICTION);

    catalog.addProduct(book1);

    assertEquals(1, catalog.getProducts().size());
    assertEquals("Harry Potter", catalog.getProducts().get(0).getName());
}

@Test
public void testApplyDiscount() {
    ProductCatalog<Gadget> gadgetCatalog = new ProductCatalog<>();
    Gadget gadget1 = new Gadget("SmartWatch", 1299, GadgetCategory.ACCESSORY);

    catalog.addProduct(gadget1);

    MarketplaceUtility.applyDiscount(gadget1, 5);
    assertEquals(1234.05, gadget1.getPrice());
}
}


