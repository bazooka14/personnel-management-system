package printer;

import repository.PersonRepository;
import repository.Repository;

public interface DataPrinter<T> {

    void displayAll(T repository);
}
