import org.example.PhoneBook;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class PhoneBookTest {
    private PhoneBook phoneBook = new PhoneBook();
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(output));
        phoneBook.add("+79998887766", "Petrov");
        phoneBook.add("+79998887765", "Aetrov");
        phoneBook.add("+79998887764", "Zetrov");
        phoneBook.add("+79998887763", "Cetrov");
        phoneBook.add("+79998887762", "Betrov");
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

    @Test
    public void shouldPrintAllNames() {
        phoneBook.printAllNames(phoneBook);
        assertEquals("Aetrov\n" +
                            "Betrov\n" +
                            "Cetrov\n" +
                            "Petrov\n" +
                            "Zetrov\n", output.toString());
    }
}
