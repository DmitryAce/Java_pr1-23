package pr2.pr2_5;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int convertToHumanAge() {
        return this.age * 7;
    }

    public String toString() {
        return "Dog [���: " + name + ", �������: " + age + "]";
    }
}

