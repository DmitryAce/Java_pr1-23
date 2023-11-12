package pr4_1.pr4_1_7;

public class CollegeStudent extends Student {
    private String university;

    public CollegeStudent(String name, String university) {
        super(name);
        this.university = university;
    }

    @Override
    public String getType() {
        return "College Student";
    }

    public String getUniversity() {
        return university;
    }
}