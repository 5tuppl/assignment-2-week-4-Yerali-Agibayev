import java.util.List;

public class RepkaStory {
    static void tell(List<Person> plot) {
        for (int i = plot.size() - 1; i > 0; i--) {
            System.out.println(plot.get(i).pull(plot.get(i-1)));
        }
    }
}
