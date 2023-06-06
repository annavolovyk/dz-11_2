package manandwomantests;
import com.dz11.manandwoman.Person;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonTest {
    private Person person;
    private Person partner;
    @Test
    public void testGetFirstName() {
        Assert.assertEquals(person.getFirstName(), "Alex");
    }

    @Test
    public void testSetFirstName() {
        person.setFirstName("Alex");
        Assert.assertEquals(person.getFirstName(), "Alex");
    }

    @Test
    public void testGetLastName() {
        Assert.assertEquals(person.getLastName(), "Smith");
    }

    @Test
    public void testSetLastName() {
        person.setLastName("Smith");
        Assert.assertEquals(person.getLastName(), "Smith");
    }

    @Test
    public void testGetAge() {
        Assert.assertEquals(person.getAge(), 64);
    }

    @Test
    public void testSetAge() {
        person.setAge(64);
        Assert.assertEquals(person.getAge(), 64);
    }

    @Test
    public void testGetPartner() {
        Assert.assertEquals(partner.getPartner(), partner);
    }

    @Test
    public void testSetPartner() {
        partner.setPartner(partner);
        Assert.assertEquals(partner.getPartner(), partner);
    }

    @Test
    public void testIsRetired() {
        Assert.assertFalse(person.isRetired());
    }

    @Test
    public void testIsNotRetired() {
        Assert.assertTrue(person.isRetired());
    }
}