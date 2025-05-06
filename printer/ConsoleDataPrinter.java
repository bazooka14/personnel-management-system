package printer;

import model.Person;
import repository.PersonRepository;
import repository.Repository;

public class ConsoleDataPrinter implements DataPrinter<PersonRepository> {
    @Override
    public void displayAll(PersonRepository repository) {
        for (int i = 0; i < repository.getSize(); i++) {
            System.out.println(repository.findById(i));
        }
    }
}
