import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by kane on 8/27/14.
 */
public class StageManager implements Runnable {

    List<Prop> props = new ArrayList<Prop>();
    Random random = new Random();

    public StageManager() {
        props.add(new Prop("CRASH! A car runs over an actor"));
        props.add(new Prop("MOOO! A cow stampedes."));
        props.add(new Prop("BANG! A cannon goes off"));
    }

    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            props.get(random.nextInt(props.size()-1)).doAction();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
