import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

//    Declares instance variable
    private Bear testBear;

    @Before
    public void before() {
        testBear = new Bear("Baloo", 12, 200.25);
    }

    @Test
    public void hasName() {
        assertEquals("Baloo", testBear.getName());
    }

    @Test
    public void hasAge() {
        assertEquals(12, testBear.getAge());
    }

    @Test
    public void hasWeight() {
        assertEquals(200.25, testBear.getWeight(), 0.01 );

    }

    @Test
    public void readyToHibernateIfGreaterThan80() {
        assertEquals(true, testBear.readyToHibernate());
    }

    @Test
    public void notReadyToHibernateIfLessThan80() {
        Bear thinBear = new Bear("Baloo", 12, 75.00);
        assertEquals(false, thinBear.readyToHibernate());
    }


}
