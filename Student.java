public class Student extends Person{
    private String schoolName;

    public Student(String name, int age, String schoolName) {
        super(name, age);
        setSchoolName(schoolName);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if (schoolName == null || schoolName.trim().isEmpty()) {
            throw new IllegalArgumentException("Название школы не может быть пустым или null");
        }
        this.schoolName = schoolName;
    }
}

