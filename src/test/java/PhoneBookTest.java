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
    }
    @Test
    public void shouldAddContact() {
        int actual = phoneBook.add("Ivanov", "+79122343445");
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindByNumber() {
        String actual = phoneBook.findByNumber("+79122343445");
        String expected = "Ivanov";
        assertEquals(expected, actual);
    }
}
