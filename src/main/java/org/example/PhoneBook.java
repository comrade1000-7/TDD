package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> phoneBook = new HashMap<>();

    public int add(String name, String number) {
        phoneBook.put(name, number);
        return phoneBook.size();
    }
}
