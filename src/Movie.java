import java.util.ArrayList;
import java.util.List;

/**
 * Created by gyovai on 8/26/2014.
 */
public class Movie {
    private Director director;
    private StageManager stageManager = new StageManager();
    private final int NUM_ACTORS = 5;

    public Movie() {
        Script script = new Script();
        director = new Director(script);
    }

    public void rollProduction() {
        Thread props = new Thread(stageManager);
        props.start();
        List<Actor> actors = director.castActors(NUM_ACTORS);
        for (int i = 0; i < director.getMaxLines(); i++) {
            for (Actor actor : actors) {
                actor.reciteLine(i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
