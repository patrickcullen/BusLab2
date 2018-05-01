import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;

    @Before
    public void before(){
        bus = new Bus("London", 3);
        person = new Person();
    }

    @Test
    public void personCount(){
        assertEquals(0, bus.personCount());
    }

    @Test
    public void addPassenger() {
        bus.addPassenger(person);
        assertEquals(1, bus.personCount());
    }

    @Test
    public void addPassenger__checkmax() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(3, bus.personCount());
    }



}
