package manandwomantests;
import com.dz11.manandwoman.Person;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PersonTest {

    @Test
    public void testGetFirstName() {
        Person person = new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
        Assert.assertEquals(person.getFirstName(), "Alex");
    }

    @Test
    public void testSetFirstName() {
        Person person = new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
        person.setFirstName("Alex");
        Assert.assertEquals(person.getFirstName(), "Alex");
    }

    @Test
    public void testGetLastName() {
        Person person = new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
        Assert.assertEquals(person.getLastName(), "Smith");
    }

    @Test
    public void testSetLastName() {
        Person person = new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
        person.setLastName("Smith");
        Assert.assertEquals(person.getLastName(), "Smith");
    }

    @Test
    public void testGetAge() {
        Person person = new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
        Assert.assertEquals(person.getAge(), 64);
    }

    @Test
    public void testSetAge() {
        Person person = new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
        person.setAge(64);
        Assert.assertEquals(person.getAge(), 64);
    }

    @Test
    public void testGetPartner() {
        Person partner = new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
        Assert.assertEquals(partner.getPartner(), partner);
    }

    @Test
    public void testSetPartner() {
        Person partner = new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
        partner.setPartner(partner);
        Assert.assertEquals(partner.getPartner(), partner);
    }

    @Test
    public void testIsRetired() {
        Person person = new Person() {
            @Override
            public boolean isRetired() {
                return false;
            }
        };
        Assert.assertFalse(person.isRetired());
    }

    @Test
    public void testIsNotRetired() {
        Person person = new Person() {
            @Override
            public boolean isRetired() {
                return getAge() > 65;
            }
        };
        Assert.assertTrue(person.isRetired());
    }
}