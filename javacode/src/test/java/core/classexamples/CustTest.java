

package core.classexamples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CustTest {

    private Cust cust;
    private List<CustAddr> addressList;

    @BeforeEach
    public void setUp() {
        cust = new Cust();
        addressList = new ArrayList<>();

        // Mocking an address object based on the CustAddr class seen in your project explorer
        CustAddr address = new CustAddr();
        addressList.add(address);
    }

    @Test
    public void testIdGettersAndSetters() {
        cust.setCustID(101L);
        assertEquals(101L, cust.getCustID(), "The getter should return the same ID set by the setter.");
    }

    @Test
    public void testNameGettersAndSetters() {
        String expectedName = "John Doe";
        cust.setCustName(expectedName);
        assertEquals(expectedName, cust.getCustName(), "The customer name should match the assigned value.");
    }

    @Test
    public void testTypeGettersAndSetters() {
        String expectedType = "Premium";
        cust.setCustType(expectedType);
        assertEquals(expectedType, cust.getCustType(), "The customer type should match the assigned value.");
    }

    @Test
    public void testAddressListGettersAndSetters() {
        cust.setCustAddrList(addressList);
        assertNotNull(cust.getCustAddrList(), "The address list should not be null.");
        assertEquals(1, cust.getCustAddrList().size(), "The address list size should match the populated size.");
    }

    @Test
    public void testToStringFormat() {
        cust.setCustID(1L);
        cust.setCustName("Alice");
        cust.setCustType("Regular");
        cust.setCustAddrList(addressList);

        String result = cust.toString();

        // Verifies the custom string builder formatting visible in your screenshot
        assertTrue(result.contains("Cust{"), "toString should start with the class signature context.");
        assertTrue(result.contains("custID=1"), "toString output must contain the assigned ID key-value.");
        assertTrue(result.contains("custName='Alice'"), "toString must format strings with enclosing single quotes.");
        assertTrue(result.contains("custType='Regular'"), "toString must format the type with enclosing single quotes.");
        assertTrue(result.contains("custAddrList="), "toString should list out the attached address data reference.");
    }
}

