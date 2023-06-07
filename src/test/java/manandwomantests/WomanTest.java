package manandwomantests;

import com.dz11.manandwoman.Man;
import com.dz11.manandwoman.Person;
import com.dz11.manandwoman.Woman;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WomanTest {
    private Woman woman;

    @BeforeMethod
    public void creatingWoman(){
        woman = new Woman("Mary", "Smith", 61, null);
    }

    @Test
    public void testIsRetired() {
        woman.setAge(61);
        Assert.assertTrue(woman.isRetired(), "Can be retired");
    }

    @Test
    public void testRegisterPartnership_NoPartner() {
        woman.setPartner(null);
        Assert.assertEquals(null, woman.getPartner());
    }

    @Test
    public void testDeregisterPartnership() {
        woman.setPartner(null);
        Assert.assertNull(woman.getPartner(),"There is no partner");
    }
}
