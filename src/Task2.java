import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i <= 20; i++) {
            //i = new Random().nextInt(0,400); //Ушул рандомго салганда 1 эле сан чыгып калып жатат эч оңдой албадым. без рандом иштеп жатат
            Set<Integer> set = new HashSet<>(List.of(i));
            sum+=i;
            System.out.print(set);
        }
        System.out.println("\nЖалпы сумма: "+sum);
    }
}
