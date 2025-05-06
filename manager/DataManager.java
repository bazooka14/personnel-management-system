package manager;

import model.Person;
import printer.DataPrinter;
import repository.PersonRepository;

public class DataManager {
    private PersonRepository repository;
    private DataPrinter<PersonRepository> printer;

    public DataManager(PersonRepository repository, DataPrinter<PersonRepository> printer) {
        this.repository = repository;
        this.printer = printer;
    }

    public void addPerson(Person... persons) {
        repository.add(persons);
    }

    public Person findById(int id) {
        return repository.findById(id);
    }

    public int getRepositorySize() {
        return repository.getSize();
    }

    public void displayAllPerson() {
        printer.displayAll(repository);
    }
}

