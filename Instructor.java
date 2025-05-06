public class Instructor extends Person {
    private String subject;

    public Instructor(String name, int age, String subject) {
        super(name, age);
        setSubject(subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if (subject == null || subject.trim().isEmpty()) {
            throw new IllegalArgumentException("Предмет не может быть пустым или null");
        }
        this.subject = subject;
    }
}
