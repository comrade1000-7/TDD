import org.example.PhoneBook;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class PhoneBookTest {
    private PhoneBook phoneBook = new PhoneBook();
    @Before
    public void setUp() {
        phoneBook.add("+79998887766", "Petrov");
    }
    @Test
    public void shouldAddContact() {
        int actual = phoneBook.add("+79122343445", "Ivanov");
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindByNumber() {
        String actual = phoneBook.findByNumber("+79998887766");
        String expected = "Petrov";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindByName() {
        String actual = phoneBook.findByName("Petrov");
        String expected = "+79998887766";
        assertEquals(expected, actual);
    }

}
