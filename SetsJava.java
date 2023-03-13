import java.util.Set;
import java.util.*;

public class SetsJava {
    public static void main(String[] args) {
        Set <Balls> ball = new HashSet<>();
        ball.add(new Balls("green"));
        ball.add(new Balls("blue"));
        ball.add(new Balls("red"));
        ball.add(new Balls("White"));
        System.out.println(ball);
    }
    /**
     * balls
String color     */
    public record Balls(String color) {
    }
}
