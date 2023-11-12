package pr9.pr9_1;

import java.util.Arrays;

class Student implements Comparable<Student> {
    private int iDNumber;
    private String name;

    public Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    @Override
    public int compareTo(Student otherStudent) {
        // Сравниваем объекты по полю iDNumber
        return Integer.compare(this.iDNumber, otherStudent.iDNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", name='" + name + '\'' +
                '}';
    }
}