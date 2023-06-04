package manandwomantests;

import com.dz11.manandwoman.Person;
import com.dz11.manandwoman.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanTest {

    @Test
    public void testIsRetired() {
        Woman woman = new Woman();
        woman.setAge(61);
        Assert.assertTrue(woman.isRetired(), "Can be retired");
    }

    @Test
    public void testRegisterPartnership_NoPartner() {
        Woman woman = new Woman();
        woman.setPartner(woman.getPartner());
        Assert.assertEquals("Mark", woman.getPartner());
    }

    @Test
    public void testDeregisterPartnership() {
        Woman woman = new Woman();
        woman.setPartner(new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        });
        woman.setLastName("Smith");
        woman.setOldLastName("Black");
        woman.deregisterPartnership(true);
        Assert.assertEquals(woman.getLastName(), "Black");
    }
}
