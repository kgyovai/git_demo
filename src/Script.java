import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by gyovai on 8/26/2014.
 */
public class Script {
    private List<String> lines = new ArrayList<String>();
    private Random random = new Random();

    public Script() {
        lines.add("Give me liberty or give me death.");
        lines.add("Do you feel lucky... punk?");
        lines.add("For the first time in a long time, yes.");
        lines.add("You can't handle the truth!");
        lines.add("You're my boy Blue!");
        lines.add("You're crazy man. I like you. But you're crazy");
        lines.add("Milk was a bad choice.");
        lines.add("Where for art thou?");
        lines.add("Out of 100 times, they might beat us 99. But not today.");
        lines.add("We who are about to die salute you");
        lines.add("You may take out lives but you will never take our FREEDOM!");
        lines.add("Working hard or hardly working eh, Mike?");
    }

    public String getRandomLine() {
        return lines.get(random.nextInt(lines.size()-1));
    }
}
