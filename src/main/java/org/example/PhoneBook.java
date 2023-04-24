package org.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> phoneBook = new HashMap<>();

    public Map<String, String> getPhoneBook() {
        return phoneBook;
    }

    public int add(String number, String name) {
        phoneBook.put(number, name);
        return phoneBook.size();
    }

    public String findByNumber(String number) {
        return phoneBook.get(number);
    }

    public String findByName(String name) {
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(name))
                return entry.getKey();
        }
        return null;
    }

    public void printAllNames(PhoneBook phoneBook) {
        phoneBook.getPhoneBook().values().stream()
                .sorted()
                .forEach(System.out::println);
    }
}
