import model.Person;
import model.Staff;

public class Main {
    public static void main(String[] args) {
        Person staff = new Staff("Паша", 24, 100000);
        System.out.println(staff);
    }
}
