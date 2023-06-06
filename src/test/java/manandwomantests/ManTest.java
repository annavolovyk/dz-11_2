package manandwomantests;
import com.dz11.manandwoman.Man;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ManTest {
    private Man man;

    @BeforeMethod
    public void creatingMan(){
        man = new Man("Alex", "Smith", 64, null);
    }
    @Test
    public void testIsRetired() {
        man.setAge(64);
        Assert.assertFalse(man.isRetired(), "Young to be retired");
    }
}
