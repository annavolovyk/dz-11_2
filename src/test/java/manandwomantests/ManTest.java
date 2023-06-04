package manandwomantests;
import com.dz11.manandwoman.Man;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManTest {
    @Test
    public void testIsRetired() {
        Man man = new Man();
        man.setAge(64);
        Assert.assertFalse(man.isRetired(), "Young to be retired");
    }
}
