import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by gyovai on 8/26/2014.
 */
public class Director {
    private Script script;
    private final int MAX_LINES = 6;
    private Random random = new Random();

    public Director(Script script) {
        this.script = script;
    }

    public List<Actor> castActors(int numberOfActors) {
        List<Actor> actors = new ArrayList<Actor>(numberOfActors);
        for (int i = 0; i < numberOfActors; i++) {
            Actor actor = new Actor(script);
            actor.learnLines(random.nextInt(MAX_LINES));
            actors.add(actor);
        }
        return actors;
    }

    public final int getMaxLines() {
        return MAX_LINES;
    }
}
