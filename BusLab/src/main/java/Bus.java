import java.util.ArrayList;

public class Bus {

    private ArrayList<Person> person;
    private String destination;
    private int capacity;

    public Bus(String destination, int capacity){
        this.person = new ArrayList<>();
        this.destination = destination;
        this.capacity = capacity;
    }

    public int personCount() {
        return this.person.size();
    }

    public void addPassenger(Person person) {
        int total = personCount();
        if (total < this.capacity)
        this.person.add(person);
    }
}
