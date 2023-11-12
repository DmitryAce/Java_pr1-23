package pr2.pr2_5;
import java.util.ArrayList;
import java.util.List;

public class DogKennel {
    private List<Dog> dogs;

    public DogKennel() {
        dogs = new ArrayList<>();
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public static void main(String[] args) {
        DogKennel kennel = new DogKennel();

        Dog dog1 = new Dog("Рекс", 3);
        Dog dog2 = new Dog("Молли", 5);
        Dog dog3 = new Dog("Макс", 2);

        kennel.addDog(dog1);
        kennel.addDog(dog2);
        kennel.addDog(dog3);

        System.out.println("Собака в питомнике:");
        for (Dog dog : kennel.getDogs()) {
            System.out.println(dog);
            System.out.println("'Человеческий' возраст собаки: " + dog.convertToHumanAge());
        }
    }
}
