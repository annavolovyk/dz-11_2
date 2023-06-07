package manandwomantests;
import com.dz11.manandwoman.Person;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PersonTest {
    private Person person;

    @BeforeMethod
    public void creatingPerson() {
        person = new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
    }
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
                Assert.assertEquals(person.getAge(), 65);
            }
            @Test
            public void testSetAge() {
                person.setAge(65);
                Assert.assertEquals(person.getAge(), 65);
            }
            @Test
            public void testGetPartner() {
                Assert.assertEquals(person.getPartner(), null);
            }
            @Test
            public void testSetPartner() {
                person.setPartner(null);
                Assert.assertEquals(person.getPartner(), null);
            }
        }