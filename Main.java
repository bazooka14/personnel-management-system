import init.DataInitializer;
import manager.DataManager;
import model.Person;
import model.Staff;
import printer.ConsoleDataPrinter;
import printer.DataPrinter;
import repository.ArrayBasedPersonRepository;
import repository.PersonRepository;

public class Main {
    public static void main(String[] args) {
        PersonRepository personRepository = new ArrayBasedPersonRepository();
        DataPrinter<PersonRepository> dataPrinter = new ConsoleDataPrinter();

        DataManager dataManager = new DataManager(personRepository, dataPrinter);
        DataInitializer dataInitializer = new DataInitializer(dataManager);

        dataInitializer.populate(30);
        dataManager.displayAllPerson();

        System.out.println();
        System.out.println(dataManager.findById(4));
        System.out.println(dataManager.findById(33));
    }
}
