import java.util.ArrayList;
import java.util.List;

public class TheLists {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Dylan");
        colors.add("Edmund");
        colors.add("Denzel");
        colors.add(1,"Power");// used to insert a value at a certain position
        colors.set(2, "Tanaka");// used to change a value on a certian index
        System.out.println(colors);
        System.out.print(colors.contains("Dylan"));
    }
}
 