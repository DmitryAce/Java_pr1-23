package pr4_1.pr4_1_7;

public class SchoolStudent extends Student {
    private int grade;

    public SchoolStudent(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    @Override
    public String getType() {
        return "School Student";
    }

    public int getGrade() {
        return grade;
    }
}

