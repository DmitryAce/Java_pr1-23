package pr3.pr3_1;
import java.util.*;

public class task1 {
    public static void main(String[] args) {
        int n = 10;
        int[] nums = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++){
            nums[i] = random.nextInt(100);
        }
        System.out.print("Массив сгенерированный через класс Random\n> ");
        for (int i = 0; i < n; i++){
            System.out.print(nums[i] + ",");
        }

        Arrays.sort(nums);
        System.out.print("\n\nМассив отсортирован\n> ");
        for (int i = 0; i < n; i++){
            System.out.print(nums[i] + ",");
        }

        for (int i = 0; i < n; i++){
            nums[i] = (int) (Math.random()*100);
        }

        System.out.print("\n\nМассив сгенерированный через метод .random()\n> ");
        for (int i = 0; i < n; i++){
            System.out.print(nums[i] + ",");
        }
    }
}
