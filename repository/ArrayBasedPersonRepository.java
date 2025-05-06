package repository;

import model.EmptyPerson;
import model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayBasedPersonRepository implements PersonRepository {
    List<Person> storage = new ArrayList<>();

    @Override
    public int getSize() {
        return storage.size();
    }

    @Override
    public void add(Person person) {
        storage.add(person);
    }

    @Override
    public void add(Person[] people) {
        this.storage.addAll(Arrays.asList(people));
    }

    @Override
    public Person findById(int id) {
        if (id < 0 || id > storage.size()) {
            return new EmptyPerson();
        }
        return storage.get(id);
    }
}
