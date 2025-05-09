package init;

import manager.DataManager;
import model.Instructor;
import model.Person;
import model.Staff;
import model.Student;

import java.util.Random;

public class DataInitializer {
    private DataManager dataManager;
    private Random random;

    public DataInitializer(DataManager dataManager) {
        this.dataManager = dataManager;
        this.random = new Random();
    }

    public void populate(int count) {
        Person staff = new Staff("Имя 1", 24, 100000);
        Person student = new Student("Имя 2", 24, "№1");
        Person instructor = new Instructor("Имя 3", 24, "Предмет №1");
        dataManager.addPerson(staff, student, instructor);

        for (int i = 0; i < count-3; i++) {
            switch (random.nextInt(3)) {
                case 0:
                    dataManager.addPerson(new Student("Имя "+i,
                            random.nextInt(6, 19),
                            "№"+i));
                    break;
                case 1:
                    dataManager.addPerson(new Staff("Имя "+i,
                            random.nextInt(23, 55),
                            random.nextInt(30, 80) * 1000));
                    break;
                case 2:
                    dataManager.addPerson(new Instructor("Имя "+i,
                            random.nextInt(27, 60),
                            "Предмет "+i));
                    break;
            }
        }
    }
}
