import java.util.ArrayList;
import java.util.List;

/**
 * Created by gyovai on 8/26/2014.
 */
public class Movie {
    private Director director;
    private List<Actor> actors = new ArrayList<Actor>();
    private Script script;
    private final int NUM_ACTORS = 3;

    public Movie() {
        script = new Script();
        director = new Director(script);
    }

    public void rollProduction() {
        actors = director.castActors(NUM_ACTORS);
        for (int i = 0; i < director.getMaxLines(); i++) {
            for (Actor actor : actors) {
                actor.reciteLine(i);
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
