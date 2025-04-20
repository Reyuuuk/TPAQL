package PersonTest;

import org.example.TP0.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    void testGetFullName() {
        Person person = new Person("Benali", "Redhouane", 25);
        assertEquals("Benali Redhouane", person.getFullName());
    }

    @Test
    void testIsAdultTrue() {
        Person person = new Person("Benali", "Mohammed", 20);
        assertTrue(person.isAdult());
    }

    @Test
    void testIsAdultFalse() {
        Person person = new Person("Benali", "abdelwaheb", 16);
        assertFalse(person.isAdult());
    }
}
