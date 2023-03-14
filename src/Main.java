import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student("Акыл", 28));
        set.add(new Student("Акыл", 28));
        set.add(new Student("Акыл", 28));
        set.add(new Student("Акыл", 28));
        set.add(new Student("Акыл", 18));
        set.forEach(System.out::println);

    }
}