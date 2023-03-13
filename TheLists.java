import java.util.ArrayList;
import java.util.List;

public class TheLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Dylan");
        colors.add("Edmund");
        colors.removeIf(x->(x=="Dylan"));
        colors.add("Denzel");
        colors.add(1,"Power");// used to insert a value at a certain position
        colors.set(2, "Tanaka");// used to change a value on a certian index
        System.out.println(colors);
        System.out.println(colors.contains("Dylan"));
        colors.forEach(x->System.out.println(x));
        List<Integer> nums=List.of(1,5,8); // if we create the list in this way it means it will be immutable
    }
}
 